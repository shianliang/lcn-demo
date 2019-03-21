package com.springcloud.tx.client.dao;

import com.springcloud.tx.client.dto.TrsferAccountDto;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class Bank02AccountClientHystric implements FallbackFactory<Bank02AccountClient> {

    @Override
    public Bank02AccountClient create(Throwable cause) {

        return new Bank02AccountClient() {
            @Override
            public int transferAccount(TrsferAccountDto trsferAccountDto) {
                return -8888;
            }
        };
    }
}
