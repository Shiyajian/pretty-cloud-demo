package com.shiyajian.cloud.demo.service.impl;

import static org.junit.Assert.*;

import com.shiyajian.cloud.demo.pojo.dto.DemoDTO;
import com.shiyajian.cloud.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceImplTest {

    @Autowired
    DemoService demoService;

    @Test
    public void getDemo() {
        DemoDTO demo = demoService.getDemo();
        System.out.println(demo);
    }
}
