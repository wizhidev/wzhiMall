package com.wizhi.mall.order.controller;

import com.wizhi.common.utils.R;
import com.wizhi.mall.order.entity.OrderEntity;
import com.wizhi.mall.order.feign.ProductFeignService;
import com.wizhi.mall.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("openfeign")
public class OpenFeignController {
    @Autowired
    private OrderService orderService;
    @Autowired
    ProductFeignService productFeignService;

    @RequestMapping("/test")
    public R test() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillContent("111111");
        orderEntity.setBillHeader("2222222");

        R brands = productFeignService.brandList();
        return R.ok().put("order", orderEntity).put("brands", brands.get("brands"));
    }
}
