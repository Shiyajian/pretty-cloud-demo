package com.shiyajian.cloud.global.entity;

import com.shiyajian.cloud.global.enums.ServiceStateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回实体
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * 如果是分页数据，表示总数据条数；
     * 如果不是分页，则为0
     */
    private Long total;

    /**
     * 数据，如果是分页，则为list
     */
    private T data;


}
