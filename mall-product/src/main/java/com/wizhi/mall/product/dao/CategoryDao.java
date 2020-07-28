package com.wizhi.mall.product.dao;

import com.wizhi.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 16:18:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
