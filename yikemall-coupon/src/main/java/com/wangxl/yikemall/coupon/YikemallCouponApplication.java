package com.wangxl.yikemall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
* 使用nacos作为配置中心统一管理配置：
*   1. 引入依赖
*       <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>*
*   2.
*
* * */
@MapperScan("com.wangxl.yikemall.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallCouponApplication.class, args);
    }

}
