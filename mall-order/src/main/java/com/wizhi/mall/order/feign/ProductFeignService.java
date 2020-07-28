package com.wizhi.mall.order.feign;

import com.wizhi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-product")
public interface ProductFeignService {
    @RequestMapping("/product/brand/brand/list")
    public R brandList();
}
