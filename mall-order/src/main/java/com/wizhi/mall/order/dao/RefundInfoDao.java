package com.wizhi.mall.order.dao;

import com.wizhi.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 01:43:06
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
