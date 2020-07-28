package com.wizhi.mall.dubbo.base.server;

import com.wizhi.mall.dubbo.base.dto.ProviderTestDTO;

import java.util.List;

/**
 * RPC接口
 * @Author wizhi
 * @CreateTime 2020/07/27 17:53
 */
public interface IProviderService {
    List<ProviderTestDTO> queryList();
}
