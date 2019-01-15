package com.shiyajian.cloud.demo.controller;

import com.google.common.collect.Maps;
import com.shiyajian.cloud.core.utils.JsonUtil;
import com.shiyajian.cloud.demo.pojo.param.DemoEnum;
import com.shiyajian.cloud.demo.pojo.param.EnumParam;
import com.shiyajian.cloud.demo.pojo.param.TrimParam;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getDemo() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                get("/demo/get?id=1234&name=hello&age=123")
        )
                .andExpect(status().isOk())
                .andReturn();
        assertTrue("demo".equalsIgnoreCase(mvcResult.getResponse().getContentAsString()));
    }

    @Test
    public void testTrim() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                get("/demo/trim?name=      ")
        )
                .andExpect(status().isOk())
                .andReturn();
        assertTrue("".equalsIgnoreCase(mvcResult.getResponse().getContentAsString()));
    }

    @Test
    public void testTrimBody() throws Exception {
        TrimParam param = new TrimParam();
        param.setName("    name   ");
        MvcResult mvcResult = mockMvc.perform(
                post("/demo/trim/body")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(JsonUtil.toJson(param))
        )
                .andExpect(status().isOk())
                .andReturn();
        assertTrue("name".equalsIgnoreCase(mvcResult.getResponse().getContentAsString()));
    }

    @Test
    public void testEnumCover() throws Exception {

        Map<String,String> map = Maps.newHashMap();
        map.put("id","123");
        map.put("name","hello");
        map.put("demoEnum","1");
        // System.out.println(map);
        MvcResult mvcResult = mockMvc.perform(
                post("/demo/enum")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(JsonUtil.toJson(map))
        )
                .andExpect(status().isOk())
                .andReturn();
        String response = mvcResult.getResponse().getContentAsString();
        System.out.println(response);
        EnumParam responseEnum = JsonUtil.toObject(JsonUtil.toJson(map), EnumParam.class);
        System.out.println(responseEnum);
        // assertTrue(responseEnum.equals(param));

    }

    @Test
    public void printEnum() throws Exception{
        MvcResult mvcResult = mockMvc.perform(
                get("/demo/enum")
        )
                .andExpect(status().isOk())
                .andReturn();
        String response = mvcResult.getResponse().getContentAsString();
        System.out.println(response);
    }

    @Test
    public void getProfile() throws Exception{
        MvcResult mvcResult = mockMvc.perform(
                get("/demo/profile")
        )
                .andExpect(status().isOk())
                .andReturn();
        String response = mvcResult.getResponse().getContentAsString();
        assertTrue("dev".equals(response));
    }
}
