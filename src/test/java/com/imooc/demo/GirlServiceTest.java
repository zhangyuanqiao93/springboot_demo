package com.imooc.demo;

import com.imooc.demo.entity.GirlEntity;
import com.imooc.demo.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create By Bridge On 2017/8/5
 * Function: JUnit单元测试
 * Description: 进行最后的项目单元测试
 */

@RunWith(SpringRunner.class) //表示将在项目中进行run
@SpringBootTest //启动整个Spring Boot工程
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        //获取一个女生的对象
        GirlEntity girl = girlService.findOne(46);//age=27
        Assert.assertEquals(new Integer(27),girl.getAge());

    }

}
