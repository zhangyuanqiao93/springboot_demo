package com.tk.spring_boot_mail.controller;

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
 * Create By Bridge On 2017/9/6
 * Function:
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MailControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getMailAddress() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/mail"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}