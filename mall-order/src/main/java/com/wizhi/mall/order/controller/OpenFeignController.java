package com.wizhi.mall.order.controller;

import com.wizhi.common.utils.R;
import com.wizhi.mall.order.entity.OrderEntity;
import com.wizhi.mall.order.feign.ProductFeignService;
import com.wizhi.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("openfeign")
public class OpenFeignController {
    @Autowired
    private OrderService orderService;
    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping("/feign/call")
    public R feignRemoteCall() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillContent("111111");
        orderEntity.setBillHeader("2222222");

        R brands = productFeignService.brandList();
        return R.ok().put("order", orderEntity).put("brands", brands.get("brands"));
    }

    @Value("${order.user.name}")
    String userName;

    @Value("${order.user.age}")
    int age;

    @RequestMapping("/configtest")
    public R ConfigTest() {
        return R.ok().put("name", userName).put("age", age);
    }


}
