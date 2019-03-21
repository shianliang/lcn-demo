package com.springcloud.tx.client.dao;

import com.springcloud.tx.client.dto.TrsferAccountDto;
import feign.hystrix.FallbackFactory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SPRINGCLOUD-TX-BANK01",fallbackFactory = Bank01AccountClientHystric.class)
public interface Bank01AccountClient {
    @PutMapping("/account")
    int transferAccount(TrsferAccountDto trsferAccountDto);

}
