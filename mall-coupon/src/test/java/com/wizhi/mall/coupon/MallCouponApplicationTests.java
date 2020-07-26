package com.wizhi.mall.coupon;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wizhi.mall.coupon.entity.MemberPriceEntity;
import com.wizhi.mall.coupon.service.MemberPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallCouponApplicationTests {

    @Autowired
    MemberPriceService memberPriceService;
    @Test
    void contextLoads() {
        List<MemberPriceEntity> list = memberPriceService.list(new QueryWrapper<MemberPriceEntity>().eq("member_level_id",1L));
        list.forEach((item)->{System.out.println(item.getMemberPrice());});
    }

}
