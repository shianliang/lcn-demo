package com.springcloud.tx.bank01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Bank01App {
    public static void main(String[] args) {
        SpringApplication.run(Bank01App.class, args);
    }
}
