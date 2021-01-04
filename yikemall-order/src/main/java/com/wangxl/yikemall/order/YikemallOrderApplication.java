package com.wangxl.yikemall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@MapperScan("com.wangxl.yikemall.order.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallOrderApplication.class, args);
    }

}
