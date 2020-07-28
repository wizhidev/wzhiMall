package com.wizhi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 16:18:35
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

