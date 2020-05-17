package com.bbc.bbcmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bbc.bbcmall.order.dao")
public class BbcmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbcmallOrderApplication.class, args);
    }

}
