package com.imooc.demo.service;

import com.imooc.demo.dao.AuthorDao;
import com.imooc.demo.entity.AuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By Bridge On 2017/9/22
 * Function:  service 实现
 * Description:
 */

@Service
public class AuthorServiceImpl implements AuthorService  {
    @Autowired
    private AuthorDao authorDao;

    @Override
    public int addAuthor(AuthorEntity author) {
        return this.authorDao.addAuthor(author);
    }

    @Override
    public int update(AuthorEntity author) {
        return this.authorDao.update(author);
    }

    @Override
    public int delete(Long id) {
        return this.authorDao.delete(id);
    }

    @Override
    public AuthorEntity findAuthor(Long id) {
        return this.authorDao.findAuthor(id);
    }

    @Override
    public List<AuthorEntity> findAuthorList() {
        return this.authorDao.findAuthorList();
    }
}
