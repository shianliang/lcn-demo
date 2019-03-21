package com.springcloud.tx.bank02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bank02App {
    public static void main(String[] args) {
        SpringApplication.run(Bank02App.class, args);
    }
}
