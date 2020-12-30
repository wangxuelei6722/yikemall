package com.wangxl.yikemall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wangxl.yikemall.product.dao")
@SpringBootApplication
public class YikemallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YikemallProductApplication.class, args);
    }

}
