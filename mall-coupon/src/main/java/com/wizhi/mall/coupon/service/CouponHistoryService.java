package com.wizhi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 01:25:02
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

