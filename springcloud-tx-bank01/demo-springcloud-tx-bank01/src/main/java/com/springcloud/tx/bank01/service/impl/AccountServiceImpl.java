package com.springcloud.tx.bank01.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.springcloud.tx.bank01.dao.AccountDao;
import com.springcloud.tx.bank01.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional
    @TxTransaction
    public int transferAccount(Long customerId, Double money) {
        //转账
        int result = accountDao.transferAccount(customerId, money);
        System.out.println("操作状态："+result);
        return result;
    }
}
