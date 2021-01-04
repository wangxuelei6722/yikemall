package com.wangxl.yikemall.product;

import com.wangxl.yikemall.product.entity.BrandEntity;
import com.wangxl.yikemall.product.service.BrandService;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class YikemallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("aaa");
        brandService.save(brandEntity);
        System.out.println("保存成功！");
    }

}
