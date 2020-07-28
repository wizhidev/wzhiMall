package com.wizhi.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wizhi.mall.product.entity.BrandEntity;
import com.wizhi.mall.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("iPhone");
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
//        list.forEach((item) -> {
//            System.out.println(item.getName());
//        });
    }
}
