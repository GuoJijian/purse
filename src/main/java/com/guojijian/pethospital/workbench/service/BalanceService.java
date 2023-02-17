package com.guojijian.pethospital.workbench.service;

import com.guojijian.pethospital.workbench.pojo.Balance;

import java.util.Map;

public interface BalanceService{
    /**
     * 查看用户余额
     */
    Balance queryBalance(String id);

    /**
     * 消费
     */
    int alterBalance(Balance balance);

    /**
     * 退款
     */
    int alterBalanceForRefund(Balance balance);
}
