package com.shiyajian.cloud.demo.dao;

import com.shiyajian.cloud.demo.pojo.dto.DemoDTO;

/**
 * @author shiyajian
 * create: 2019-01-24
 */
public interface DemoDAO {

    DemoDTO getDemo(Long id);
}
