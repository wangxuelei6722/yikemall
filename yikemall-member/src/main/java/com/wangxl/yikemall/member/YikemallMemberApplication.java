package com.wangxl.yikemall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 远程调用别的服务：
* 1.引入依赖open-feign
* 2.编写一个接口，告诉springcloud这个接口需要调用远程服务。
*    2.1 声明接口的每一个方法都是调用哪个远程服务的请求。
* 3.开启远程调用功能。application上添加注解 @EnableFeignClients
* */
@EnableFeignClients(basePackages = "com.wangxl.yikemall.member.feign")
//@MapperScan("com.wangxl.yikemall.member.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class YikemallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallMemberApplication.class, args);
    }

}
