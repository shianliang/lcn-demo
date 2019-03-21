package com.springcloud.tx.client.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.springcloud.tx.client.dao.Bank01AccountClient;
import com.springcloud.tx.client.dao.Bank02AccountClient;
import com.springcloud.tx.client.dto.TrsferAccountDto;
import com.springcloud.tx.client.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    private Bank01AccountClient bank01AccountClient;

    @Autowired
    private Bank02AccountClient bank02AccountClient;


    @Override
    @Transactional
    @TxTransaction(isStart = true)
    public int transferAccount(TrsferAccountDto trsferAccountDto) {
        //转账--->bank01用户账户加上转账金额
        int bank01Result = bank01AccountClient.transferAccount(trsferAccountDto);
        //通过调用的接口参数决定是否抛异常
        if(trsferAccountDto.getTransferMoney()%2==0){
            int i=1/0;
        }
        //转账--->bank02用户账户减转账金额
        Double transferMoney = trsferAccountDto.getTransferMoney();
        trsferAccountDto.setTransferMoney(-transferMoney);
        int bank02Result = bank02AccountClient.transferAccount(trsferAccountDto);
        System.out.println("bank01操作："+(bank01Result>0));
        System.out.println("bank02操作："+(bank02Result>0));
        return 99;
    }
}
