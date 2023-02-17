package com.guojijian.pethospital.workbench.service.impl;

import com.guojijian.pethospital.workbench.mapper.BalanceMapper;
import com.guojijian.pethospital.workbench.pojo.Balance;
import com.guojijian.pethospital.workbench.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("balanceService")
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private BalanceMapper balanceMapper;

    @Override
    public Balance queryBalance(String id) {
        return balanceMapper.selectBalance(id);
    }

    @Override
    public int alterBalance(Balance balance) {
        return balanceMapper.updateBalanceById(balance);
    }

    @Override
    public int alterBalanceForRefund(Balance balance) {
        return balanceMapper.updateBalanceForReFundById(balance);
    }
}
