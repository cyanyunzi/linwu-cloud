package com.linwu.eureka.consumer.controller;


import com.linwu.eureka.ConsumerFeignApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author ：ZhangLei
 * @date ：2018/6/1
 * @description :
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerFeignApplication.class)
public class RibbonConsumerControllerTest {
    @Autowired
    private WebApplicationContext context;
    private MockMvc mvc;

    @Before
    public void setUp(){
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    /**
     * 测试ribbon调用远程双节点服务，负载均衡测试
     */
    @Test
    public void test1() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/consumer")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andReturn();

        Assert.assertNotNull(result.getResponse().getContentAsString());

    }
}