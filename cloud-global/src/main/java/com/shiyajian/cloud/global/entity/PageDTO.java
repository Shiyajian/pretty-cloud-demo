package com.shiyajian.cloud.global.entity;

import lombok.Data;

import java.util.List;

/**
 * 全局统一分页实体
 * @author shiyajian
 * create: 2018-10-24
 */
@Data
public class PageDTO<T> {

    private Long total;

    private List<T> data;
}
