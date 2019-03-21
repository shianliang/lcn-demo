package com.springcloud.tx.client.dao;

import com.springcloud.tx.client.dto.TrsferAccountDto;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PutMapping;

@Component
public class Bank01AccountClientHystric implements FallbackFactory<Bank01AccountClient>{


    @Override
    public Bank01AccountClient create(Throwable cause) {
        return new Bank01AccountClient() {
            @Override
            public int transferAccount(TrsferAccountDto trsferAccountDto) {
                return -999;
            }
        };
    }
}
