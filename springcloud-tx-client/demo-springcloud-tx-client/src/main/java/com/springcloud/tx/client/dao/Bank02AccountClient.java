package com.springcloud.tx.client.dao;

import com.springcloud.tx.client.dto.TrsferAccountDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "SPRINGCLOUD-TX-BANK02",fallbackFactory = Bank02AccountClientHystric.class)
public interface Bank02AccountClient {


    @PutMapping("/account")
    int transferAccount(TrsferAccountDto trsferAccountDto);

}
