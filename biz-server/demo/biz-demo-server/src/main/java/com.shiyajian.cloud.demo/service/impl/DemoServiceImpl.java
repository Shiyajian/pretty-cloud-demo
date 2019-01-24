package com.shiyajian.cloud.demo.service.impl;

import com.shiyajian.cloud.demo.dao.DemoDAO;
import com.shiyajian.cloud.demo.pojo.dto.DemoDTO;
import com.shiyajian.cloud.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shiyajian
 * create: 2019-01-10
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoDAO demoDAO;

    @Override
    public DemoDTO getDemo() {
        return demoDAO.getDemo(1L);
    }
}
