package com.imooc.demo.service;

import com.imooc.demo.entity.GirlEntity;
import com.imooc.demo.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
