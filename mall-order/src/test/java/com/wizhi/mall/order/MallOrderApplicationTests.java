package com.wizhi.mall.order;

import com.wizhi.mall.order.entity.OrderEntity;
import com.wizhi.mall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillType(1);
        orderEntity.setBillContent("Apple iPhone");
        orderService.save(orderEntity);
    }

}
