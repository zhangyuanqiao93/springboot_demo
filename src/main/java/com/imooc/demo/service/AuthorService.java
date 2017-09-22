package com.imooc.demo.service;

import com.imooc.demo.entity.AuthorEntity;

import java.util.List;

/**
 * Create By Bridge On 2017/9/22
 * Function:
 * Description:
 */

public interface AuthorService {
    int addAuthor(AuthorEntity author);
    int update(AuthorEntity author);
    int delete(Long id);
    AuthorEntity findAuthor(Long id);
    List<AuthorEntity> findAuthorList();
}