package com.springcloud.tx.bank02.service;

public interface AccountService {

    int transferAccount(Long customerId, Double money);

}
