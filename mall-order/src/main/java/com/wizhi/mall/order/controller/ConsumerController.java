package com.wizhi.mall.order.controller;

import com.wizhi.mall.dubbo.base.dto.ProviderTestDTO;
import com.wizhi.mall.dubbo.base.server.IProviderService;
import com.wizhi.mall.dubbo.base.vo.ResultVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 消费测试接口
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/consumer")
public class ConsumerController {
    // Dubbo远程调用注解
    @Reference
    private IProviderService providerService;

    @RequestMapping(value = "/list")
    public ResultVO getList() {
        // 远程调用
        List<ProviderTestDTO> providerTestDTOList = providerService.queryList();
        return new ResultVO.Builder<>().code(200).message("success").data(providerTestDTOList).build();
    }
}