package com.wizhi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wizhi
 * @email wizhi.dev@gmail.com
 * @date 2020-07-27 01:37:04
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

