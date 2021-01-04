package com.wangxl.yikemall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wangxl.yikemall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallCouponApplication.class, args);
    }

}
