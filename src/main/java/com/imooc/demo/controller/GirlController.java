package com.imooc.demo.controller;

import com.imooc.demo.entity.GirlEntity;
import com.imooc.demo.repository.GirlRepository;
import com.imooc.demo.service.GirlService;
import com.imooc.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;


@RestController
public class GirlController {

    //spring 自带的一个日志框架,位于*****"org.slf4j.Logger"*****包中
    public static Logger logger = LoggerFactory.getLogger(GirlController.class);

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

//        System.out.println("girlEntityList");
        logger.info("girlEntityList");
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
    public Object girlAdd2(@Valid GirlEntity girl, BindingResult bindingResult){
        /**
         *  @Valid 注解，表单验证(17/8/4)
         */

//        ResultEntity result = new ResultEntity();
        if (bindingResult.hasErrors()){
//            result.setCoede(1); //不成功返回错误信息
//            result.setMsg(bindingResult.getFieldError().getDefaultMessage());
//            logger.error(bindingResult.getFieldError().getDefaultMessage());
//            return null;
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
//            System.out.println(bindingResult.getFieldError().getDefaultMessage());
        }else {
            //GirlEntity girl = new GirlEntity(); // 添加一个Girl
//            result.setCoede(0);
//            result.setMsg("成功");
//            result.setData(girlRepository.save(girl));
            return ResultUtil.success(girlRepository.save(girl));
        }
    }
    /**
     * function：根据id查询一个girl
     * @param id
     * @return
     */
    @GetMapping(value = "girls/{id}")
    public GirlEntity girlFindOne(@PathVariable("id") Integer id){
//        System.out.println("girlFindOne");
        logger.info("girlFindOne");
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
//        System.out.println("girlUpdate");
        logger.info("girlUpdate");
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
//        System.out.println("girlUpdate");
        logger.info("girlUpdate");
        return  girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    @Transactional  //事物处理
    public void girlTwo(){
//        System.out.println("girlTwo");
        logger.info("girlTwo");
        girlService.insertTwo();
    }

    /**
     * 需求：判断女生年龄，<10岁，应该在上小学
     * 10-16在上初中
     */

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception {

        girlService.getAge(id);

    }


}
