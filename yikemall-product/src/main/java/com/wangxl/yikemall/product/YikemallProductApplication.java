package com.wangxl.yikemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.wangxl.yikemall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallProductApplication.class, args);
    }

}
