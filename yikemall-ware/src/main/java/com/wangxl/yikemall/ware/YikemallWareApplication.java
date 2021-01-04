package com.wangxl.yikemall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@MapperScan("com.wangxl.yikemall.ware.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallWareApplication.class, args);
    }

}
