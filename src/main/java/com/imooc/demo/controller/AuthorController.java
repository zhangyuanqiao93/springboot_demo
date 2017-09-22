package com.imooc.demo.controller;

import com.alibaba.dubbo.common.json.JSONObject;
import com.imooc.demo.entity.AuthorEntity;
import com.imooc.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create By Bridge On 2017/9/22
 * Function: AuthorController
 * Description:
 */

@RestController
@RequestMapping(value="/data/jdbc/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;
    /**
     * 查询用户列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> getAuthorList(HttpServletRequest request) {
        List<AuthorEntity> authorList = this.authorService.findAuthorList();
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("total", authorList.size());
        param.put("rows", authorList);
        return param;
    }
    /**
     * 查询用户信息
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.GET)
    public AuthorEntity getAuthor(@PathVariable Long userId, HttpServletRequest request) {
        AuthorEntity author = this.authorService.findAuthor(userId);
        if(author == null){
            throw new RuntimeException("查询错误");
        }
        return author;
    }

    /**
     * 新增方法
     */
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody JSONObject jsonObject) {
        String userId = jsonObject.getString("user_id");
        String realName = jsonObject.getString("real_name");
        String nickName = jsonObject.getString("nick_name");
        AuthorEntity author = new AuthorEntity();
        if (author!=null) {
            author.setId(Long.valueOf(userId));
        }
        author.setRealName(realName);
        author.setNickName(nickName);
        try{
            this.authorService.addAuthor(author);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("新增错误");
        }
    }
    /**
     * 更新方法
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.PUT)
    public void update(@PathVariable Long userId, @RequestBody JSONObject jsonObject) {
        AuthorEntity author = this.authorService.findAuthor(userId);
        String realName = jsonObject.getString("real_name");
        String nickName = jsonObject.getString("nick_name");
        author.setRealName(realName);
        author.setNickName(nickName);
        try{
            this.authorService.update(author);
        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("更新错误");
        }
    }
    /**
     * 删除方法
     */
    @RequestMapping(value = "/{userId:\\d+}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long userId) {
        try{
            this.authorService.delete(userId);
        }catch(Exception e){
            throw new RuntimeException("删除错误");
        }
    }
}
