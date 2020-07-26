package com.wizhi.mall.member;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wizhi.mall.member.entity.MemberEntity;
import com.wizhi.mall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallMemberApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    void contextLoads() {
//        MemberEntity memberEntity= new MemberEntity();
//        memberEntity.setEmail("wzhi.dev@gmail.com");
//        memberEntity.setCity("Xian");
//        memberService.save(memberEntity)
        List<MemberEntity> list = memberService.list(new QueryWrapper<MemberEntity>().eq("city", "Xian"));
        list.forEach((item) -> {
            System.out.println(item.getEmail());
        });
    }

}
