package com.shiyajian.cloud.core.entity;

import lombok.Data;

import java.util.List;

/**
 * 全局统一分页实体
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@Data
public class PageVO<T> {

    /**
     * 数据总条数
     */
    private Long total;

    /**
     * 数据内容
     */
    private List<T> data;

    public PageVO() {
    }

    public PageVO(Long total, List<T> data) {
        this.total = total;
        this.data = data;
    }
}
