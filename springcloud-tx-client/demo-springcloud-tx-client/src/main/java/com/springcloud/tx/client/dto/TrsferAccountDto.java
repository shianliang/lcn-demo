package com.springcloud.tx.client.dto;

import lombok.Data;

@Data
public class TrsferAccountDto {
    //转账金额
    private Double transferMoney;
    //客户id
    private Long customerId;
}
