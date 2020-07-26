package com.wizhi.mall.ware;

import com.wizhi.mall.ware.entity.WmsWareInfoEntity;
import com.wizhi.mall.ware.service.WmsWareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallWareApplicationTests {

    @Autowired
    WmsWareInfoService wmsWareInfoService;
    @Test
    void contextLoads() {
        WmsWareInfoEntity wmsWareInfoEntity = new WmsWareInfoEntity();
        wmsWareInfoEntity.setAddress("西安老城根");
        wmsWareInfoEntity.setAreacode("029");
        wmsWareInfoService.save(wmsWareInfoEntity);
    }

}
