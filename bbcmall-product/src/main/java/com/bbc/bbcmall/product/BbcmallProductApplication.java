package com.bbc.bbcmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bbc.bbcmall.product.dao")
public class BbcmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbcmallProductApplication.class, args);
    }

}
