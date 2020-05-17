package com.bbc.bbcmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bbc.bbcmall.ware.dao")
public class BbcmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbcmallWareApplication.class, args);
    }

}
