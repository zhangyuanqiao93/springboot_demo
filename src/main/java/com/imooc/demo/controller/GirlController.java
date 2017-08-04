package com.imooc.demo.controller;

import com.imooc.demo.entity.GirlEntity;
import com.imooc.demo.repository.GirlRepository;
import com.imooc.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;


@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /**
     *  function: 查询所有girl的列表
     * @return
     */
    @GetMapping(value = "/girls")
    public List<GirlEntity> girlEntityList(){
        return girlRepository.findAll();
    }

    /**
     * function：添加一个girl
     * @param cupSize
     * @param age
     * @return
     */
    //@PostMapping(value = "/girls") //post方法传递参数用注解:@RequestParam
  /*  public GirlEntity girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        GirlEntity girl = new GirlEntity(); // 添加一个Girl

        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }*/


    /**
     * 添加一个女生
     * @param girl
     * @return
     */
    @PostMapping(value = "/girls") //post方法传递参数用注解:@RequestParam
    public GirlEntity girlAdd2(@Valid GirlEntity girl, BindingResult bindingResult){
        //@Valid 注解，表单验证(17/8/4)
        if (bindingResult.hasErrors()){

            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        //GirlEntity girl = new GirlEntity(); // 添加一个Girl
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());

        return girlRepository.save(girl);
    }
    /**
     * function：根据id查询一个girl
     * @param id
     * @return
     */
    @GetMapping(value = "girls/{id}")
    public GirlEntity girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    /**
     * function: 更新数据库
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "girls/{id}")
    public GirlEntity girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        GirlEntity girl = new GirlEntity();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);

        return girlRepository.save(girl);

    }

    /**
     * function：删除一个Girl
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    //通过年龄来查询
    @GetMapping(value = "girls/age/{age}")
    public List<GirlEntity> girlListByAge(@PathVariable("age") Integer age){

        return  girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    @Transactional  //事物处理
    public void girlTwo(){
        girlService.insertTwo();
    }


}
