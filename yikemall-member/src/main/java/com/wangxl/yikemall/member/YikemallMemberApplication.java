package com.wangxl.yikemall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@MapperScan("com.wangxl.yikemall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallMemberApplication.class, args);
    }

}
