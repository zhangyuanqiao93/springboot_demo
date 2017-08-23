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
 * Create By Bridge On 2017/8/23
 * Function:
 * Description:
 */

@RunWith(SpringRunner.class)//启动spring boot project
@SpringBootTest
@AutoConfigureMockMvc//测试controller
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void getAllApp() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/e-charts"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        System.out.println("url: /e-charts");
    }

    @Test
    public void getAllECharts() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/getAllECharts"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        System.out.println("url: /getAllECharts");
    }

}