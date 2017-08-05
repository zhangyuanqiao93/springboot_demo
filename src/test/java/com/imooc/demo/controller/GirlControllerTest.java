package com.imooc.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Create By Bridge On 2017/8/5
 * Function:  mvn打包工具可以直接执行所有的单元测试。
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc  //对controller进行测试
public class GirlControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void girlEntityList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("200"));
    }

}