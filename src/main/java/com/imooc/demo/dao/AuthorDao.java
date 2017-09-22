package com.imooc.demo.dao;

import com.imooc.demo.entity.AuthorEntity;

import java.util.List;

/**
 * Create By Bridge On 2017/9/22
 * Function: AuthorDao 接口
 * Description:
 */
public interface AuthorDao {

    int addAuthor(AuthorEntity author);//增加一个author
    int update(AuthorEntity author);//更新一个author
    int delete(Long id) ;//删除一个author
    AuthorEntity findAuthor(Long id);//查找一个author
    List<AuthorEntity> findAuthorList();//查找多个author

}
