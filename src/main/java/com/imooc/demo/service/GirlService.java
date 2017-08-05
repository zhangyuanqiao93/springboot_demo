package com.imooc.demo.service;

import com.imooc.demo.entity.GirlEntity;
import com.imooc.demo.exception.GirlException;
import com.imooc.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * service 层处理业务逻辑
 */

@Service
public class GirlService {

    @Autowired
    GirlRepository girlRepository;

    public void insertTwo(){

        GirlEntity girlA = new GirlEntity();
        girlA.setAge(18);
        girlA.setCupSize("D");
        girlRepository.save(girlA);

        GirlEntity girlB = new GirlEntity();
        girlB.setAge(19);
        girlB.setCupSize("E");
        girlRepository.save(girlB);

    }

    /**
     * Bridge
     * 2017/8/5
     * 根据女生年龄，判断是小学初中高中大学
     */

    /**
     * 统一异常处理
     * @param id
     */
    public void getAge(Integer id) throws Exception {

        GirlEntity girl = girlRepository.findOne(id); //查询一个女生，再对年龄判断
        Integer age = girl.getAge();

        //if else 可以看成表单的验证
        if (age < 23){
        //返回可能在上小学
            throw new GirlException(99,"可能在上大学");
//            return 1;
        }else if (age >24 && age<28 ){
            //返回可能在上初中
            throw new GirlException(101,"可能在上硕士研究生");
//            return 2;
        }
//        return 0;
    }
}
