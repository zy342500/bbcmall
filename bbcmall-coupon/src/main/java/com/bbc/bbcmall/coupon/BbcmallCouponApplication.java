package com.bbc.bbcmall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bbc.bbcmall.coupon.dao")
public class BbcmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(BbcmallCouponApplication.class, args);
    }

}
