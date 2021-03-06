package com.wizhi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 16:18:35
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

