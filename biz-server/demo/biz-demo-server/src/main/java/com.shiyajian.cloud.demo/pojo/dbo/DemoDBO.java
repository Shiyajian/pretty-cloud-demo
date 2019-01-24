package com.shiyajian.cloud.demo.pojo.dbo;

import com.shiyajian.cloud.demo.pojo.enums.StatusEnum;
import lombok.Data;

import javax.persistence.Table;

/**
 * @author shiyajian
 * create: 2019-01-24
 */
@Data
@Table(name = "t_demo")
public class DemoDBO {

    private Long id;

    private String name;

    private StatusEnum status;
}
