package com.shiyajian.cloud.demo.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertTrue;
import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
        assertTrue("hello".equalsIgnoreCase(mvcResult.getResponse().getContentAsString()));
    }
}
