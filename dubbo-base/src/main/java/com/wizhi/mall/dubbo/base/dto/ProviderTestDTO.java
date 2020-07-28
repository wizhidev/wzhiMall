package com.wizhi.mall.dubbo.base.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * RPC接口DTO
 * 注意这里要实现序列化接口
 * @Author wizhi
 * @CreateTime 2020/07/27 17:53
 */
@Data
public class ProviderTestDTO implements Serializable {
    // ID
    private int id;
    // 名字
    private String name;
    // 序号
    private Integer number;
}