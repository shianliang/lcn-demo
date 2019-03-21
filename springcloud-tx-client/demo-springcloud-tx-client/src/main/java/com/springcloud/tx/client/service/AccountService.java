package com.springcloud.tx.client.service;

import com.springcloud.tx.client.dto.TrsferAccountDto;

public interface AccountService {

    int transferAccount(TrsferAccountDto trsferAccountDto);

}
