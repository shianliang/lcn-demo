package com.springcloud.tx.bank02.entities;

import lombok.Data;

/**
 * 客户账户
 */
@Data
public class Account {

    private Long id;

    private Double balance;

    private String bank_name;

}
