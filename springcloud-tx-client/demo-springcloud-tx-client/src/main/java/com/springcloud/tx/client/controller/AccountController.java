package com.springcloud.tx.client.controller;

import com.springcloud.tx.client.dto.TrsferAccountDto;
import com.springcloud.tx.client.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;
    @PutMapping("/account")
    public Object trsferAccount(@RequestBody TrsferAccountDto trsferAccountDto){
        return accountService.transferAccount(trsferAccountDto);
    }

}
