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
 * Description: 测试不同的方法，可以将get换成post，delete，put等，测试方法类似。
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc  //对controller进行测试
public class GirlControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void girlEntityList() throws Exception {

        //实际返回的字符串
        //String str = new String({"id":1,"cupSize":"E","age":18,"money":22.0},{"id":2,"cupSize":"E","age":18,"money":22.0},{"id":3,"cupSize":"E","age":18,"money":22.0},{"id":4,"cupSize":"E","age":18,"money":22.0},{"id":5,"cupSize":"E","age":18,"money":22.0},{"id":6,"cupSize":"E","age":18,"money":22.0},{"id":7,"cupSize":"E","age":18,"money":22.0},{"id":8,"cupSize":"E","age":18,"money":22.0},{"id":9,"cupSize":"E","age":18,"money":22.0},{"id":10,"cupSize":"E","age":22,"money":22.0},{"id":11,"cupSize":"D","age":18,"money":2.0},{"id":12,"cupSize":"D","age":18,"money":2.0},{"id":13,"cupSize":"D","age":22,"money":2.0},{"id":14,"cupSize":"D","age":22,"money":2.0},{"id":15,"cupSize":"D","age":22,"money":2.0},{"id":16,"cupSize":"D","age":22,"money":2.0},{"id":17,"cupSize":"D","age":22,"money":2.0},{"id":18,"cupSize":"D","age":22,"money":2.0},{"id":19,"cupSize":"D","age":22,"money":2.0},{"id":20,"cupSize":"D","age":22,"money":2.0},{"id":21,"cupSize":"D","age":22,"money":2.0},{"id":22,"cupSize":"D","age":22,"money":2.0},{"id":23,"cupSize":"D","age":22,"money":2.0},{"id":24,"cupSize":"D","age":22,"money":2.0},{"id":25,"cupSize":"D","age":22,"money":2.0},{"id":26,"cupSize":"D","age":22,"money":2.0},{"id":27,"cupSize":"D","age":22,"money":2.0},{"id":28,"cupSize":"D","age":22,"money":2.0},{"id":29,"cupSize":"D","age":22,"money":2.0},{"id":30,"cupSize":"D","age":22,"money":2.0},{"id":31,"cupSize":"D","age":22,"money":2.0},{"id":32,"cupSize":"D","age":22,"money":2.0},{"id":33,"cupSize":"D","age":22,"money":2.0},{"id":34,"cupSize":"D","age":22,"money":2.0},{"id":35,"cupSize":"D","age":22,"money":2.0},{"id":36,"cupSize":"E","age":25,"money":23.0},{"id":37,"cupSize":"E","age":25,"money":23.0},{"id":38,"cupSize":"E","age":25,"money":23.0},{"id":39,"cupSize":"E","age":25,"money":23.0},{"id":40,"cupSize":"E","age":21,"money":23.0},{"id":41,"cupSize":"E","age":21,"money":23.0},{"id":42,"cupSize":"E","age":21,"money":23.0},{"id":43,"cupSize":"E","age":21,"money":23.0},{"id":44,"cupSize":"E","age":21,"money":23.0},{"id":45,"cupSize":"E","age":21,"money":25.0},{"id":46,"cupSize":"E","age":27,"money":25.0})

        mockMvc.perform(MockMvcRequestBuilders.get("/girls"))
                .andExpect(MockMvcResultMatchers.status().isOk());
                //.andExpect(MockMvcResultMatchers.content().string("200"));
    }



}