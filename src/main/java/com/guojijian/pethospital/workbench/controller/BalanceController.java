package com.guojijian.pethospital.workbench.controller;

import com.guojijian.pethospital.commons.contants.Contants;
import com.guojijian.pethospital.commons.pojo.ReturnObject;
import com.guojijian.pethospital.commons.util.UUIDUtils;
import com.guojijian.pethospital.workbench.pojo.Balance;
import com.guojijian.pethospital.workbench.pojo.BalanceHistory;
import com.guojijian.pethospital.workbench.pojo.Order;
import com.guojijian.pethospital.workbench.service.BalanceHistoryService;
import com.guojijian.pethospital.workbench.service.BalanceService;
import com.guojijian.pethospital.workbench.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BalanceController {

    @Autowired
    private BalanceService balanceService;
    @Autowired
    private BalanceHistoryService balanceHistoryService;
    @Autowired
    private OrderService orderService;

    @RequestMapping("/workbench/queryBalance")
    @ResponseBody
    public Object queryBalance(String id){
        //查询余额
        Balance balance=balanceService.queryBalance(id);
        return balance.getMoney();
    }

    @RequestMapping("/workbench/alterBalance")
    @ResponseBody
    public Object alterBalance(Balance balance){
        ReturnObject ro=new ReturnObject();
        try{
            //消费
            int result=balanceService.alterBalance(balance);
            if(result>0){
                //封装订单对象
                Order order=new Order();
                order.setId(UUIDUtils.getUUID());
                order.setMoney(balance.getMoney());
                order.setBalanceId(balance.getId());
                //添加订单记录
                orderService.createOrder(order);
                //封装消费记录对象
                BalanceHistory bh=new BalanceHistory();
                bh.setId(UUIDUtils.getUUID());
                bh.setStatus(Contants.STATUS_SPENDING);
                bh.setMoney(balance.getMoney());
                bh.setBalanceId(balance.getId());
                //添加消费记录
                balanceHistoryService.createBalanceHistory(bh);
                //封装返回信息
                ro.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);
                ro.setRetObject(order);
            }else{
                ro.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
                ro.setMessage("网络繁忙，请稍后再试！");
            }
        }catch (Exception e){
            e.printStackTrace();
            ro.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            ro.setMessage("网络繁忙，请稍后再试！");
        }
        return ro;
    }

    @RequestMapping("/workbench/queryOrderAll")
    @ResponseBody
    public Object queryOrderAll(){
        //查询订单
        List<Order> orderList=orderService.queryOrderAll();
        return orderList;
    }

    @RequestMapping("/workbench/alterBalanceForRefund")
    @ResponseBody
    public Object alterBalanceForRefund(Order order){
        ReturnObject ro=new ReturnObject();
        try{
            //封装balance对象
            Balance balance=new Balance();
            balance.setId(order.getBalanceId());
            balance.setMoney(order.getMoney());
            //退款
            int alterResult=balanceService.alterBalanceForRefund(balance);
            //删除订单
            int dropResult=orderService.dropOrderById(order.getId());
            //封装消费记录对象
            BalanceHistory bh=new BalanceHistory();
            bh.setId(UUIDUtils.getUUID());
            bh.setStatus(Contants.STATUS_REFUND);
            bh.setMoney(order.getMoney());
            bh.setBalanceId(order.getBalanceId());
            //添加消费记录
            balanceHistoryService.createBalanceHistory(bh);
            if((alterResult+dropResult)==2){
                ro.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);
            }else{
                throw new Exception("alterBalanceForRefund() 执行未成功！");
            }
        }catch (Exception e){
            e.printStackTrace();
            ro.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            ro.setMessage("网络繁忙，请稍后再试！");
        }
        return ro;
    }

    @RequestMapping("/workbench/queryBalanceHistoryAllById")
    @ResponseBody
    public Object queryBalanceHistoryAllById(String id){
        //查询所有记录
        List<BalanceHistory> balanceHistoryList=balanceHistoryService.queryBalanceHistoryAllById(id);

        return balanceHistoryList;
    }
}
