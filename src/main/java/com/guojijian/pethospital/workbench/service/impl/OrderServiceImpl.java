package com.guojijian.pethospital.workbench.service.impl;

import com.guojijian.pethospital.workbench.mapper.OrderMapper;
import com.guojijian.pethospital.workbench.pojo.Order;
import com.guojijian.pethospital.workbench.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> queryOrderAll() {
        return orderMapper.selectOrderAll();
    }

    @Override
    public int dropOrderById(String id) {
        return orderMapper.deleteOrderById(id);
    }

    @Override
    public int createOrder(Order order) {
        return orderMapper.insertOrder(order);
    }
}
