package com.shiyajian.cloud.global.entity;

import lombok.Data;

/**
 * 统一返回实体
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@Data
public class ResponseVO<T> {

    /**
     * 统一返回状态码
     */
    private Integer code;

    /**
     * 统一返回状态码对应的描述
     */
    private String msg;

    /**
     * 是否成功
     */
    private Boolean succeeded;

    /**
     * 如果是分页数据，表示总数据条数；
     * 如果不是分页，则为0
     */
    private Long total;

    /**
     * 数据，如果是分页，则为list
     */
    private T data;

    public ResponseVO() {
    }

    public ResponseVO(Integer code, String msg, Boolean succeeded, Long total, T data) {
        this.code = code;
        this.msg = msg;
        this.succeeded = succeeded;
        this.total = total;
        this.data = data;
    }
}
