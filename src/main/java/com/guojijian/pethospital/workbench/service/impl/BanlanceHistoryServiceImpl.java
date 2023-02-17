package com.guojijian.pethospital.workbench.service.impl;

import com.guojijian.pethospital.workbench.mapper.BalanceHistoryMapper;
import com.guojijian.pethospital.workbench.pojo.BalanceHistory;
import com.guojijian.pethospital.workbench.service.BalanceHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("balanceHistoryService")
public class BanlanceHistoryServiceImpl implements BalanceHistoryService {

    @Autowired
    private BalanceHistoryMapper balanceHistoryMapper;

    @Override
    public int createBalanceHistory(BalanceHistory balanceHistory) {
        return balanceHistoryMapper.insertBalanceHistory(balanceHistory);
    }

    @Override
    public List<BalanceHistory> queryBalanceHistoryAllById(String id) {
        return balanceHistoryMapper.queryBalanceHistoryAllById(id);
    }
}
