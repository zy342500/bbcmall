package com.bbc.bbcmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bbc.bbcmall.member.dao")
@EnableFeignClients(basePackages = "com.bbc.bbcmall.member.feign")
public class BbcmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbcmallMemberApplication.class, args);
    }

}
