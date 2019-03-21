package com.springcloud.tx.bank01.dto;

import lombok.Data;

@Data
public class TrsferAccountDto {
    //转账金额
    private Double transferMoney;
    //客户id
    private Long customerId;
}
