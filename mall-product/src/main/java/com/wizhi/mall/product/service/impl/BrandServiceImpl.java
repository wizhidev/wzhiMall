package com.wizhi.mall.product.service.impl;

import com.wizhi.mall.dubbo.base.dto.ProviderTestDTO;
import com.wizhi.mall.dubbo.base.server.IProviderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wizhi.common.utils.PageUtils;
import com.wizhi.common.utils.Query;

import com.wizhi.mall.product.dao.BrandDao;
import com.wizhi.mall.product.entity.BrandEntity;
import com.wizhi.mall.product.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity>
        implements BrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

}