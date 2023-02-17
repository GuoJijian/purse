package com.guojijian.pethospital.workbench.service;

import com.guojijian.pethospital.workbench.pojo.BalanceHistory;

import java.util.List;

public interface BalanceHistoryService {
    /**
     * 添加记录
     */
    int createBalanceHistory(BalanceHistory balanceHistory);

    /**
     * 查询记录
     */
    List<BalanceHistory> queryBalanceHistoryAllById(String id);
}
