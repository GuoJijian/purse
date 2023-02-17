package com.guojijian.pethospital.workbench.service;

import com.guojijian.pethospital.workbench.pojo.Order;

import java.util.List;

public interface OrderService{
    /**
     * 查询订单
     */
    List<Order> queryOrderAll();

    /**
     * 根据id删除订单
     */
    int dropOrderById(String id);

    /**
     * 添加订单
     */
    int createOrder(Order order);
}
