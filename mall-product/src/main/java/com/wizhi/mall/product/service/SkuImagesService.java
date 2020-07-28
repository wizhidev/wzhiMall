package com.wizhi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.mall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 16:18:35
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

