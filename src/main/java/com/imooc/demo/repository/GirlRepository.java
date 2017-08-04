package com.imooc.demo.repository;

import com.imooc.demo.entity.GirlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<GirlEntity,Integer> {
        //通过年龄age查询

    public List<GirlEntity> findByAge(Integer age);
}
