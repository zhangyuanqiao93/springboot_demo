package com.imooc.demo.dao;

import com.imooc.demo.entity.AuthorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create By Bridge On 2017/9/22
 * Function:
 * Description:
 */

@Repository
public class AuthorDaoImpl implements AuthorDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addAuthor(AuthorEntity author) {
        return jdbcTemplate.update("INSERT INTO t_author(real_name, nick_name) values(?, ?)",
                author.getRealName(),author.getNickName());
    }

    @Override
    public int update(AuthorEntity author) {
        return  jdbcTemplate.update("update t_author set real_name = ?, nick_name = ? where id = ?",
                new Object[]{author.getRealName(), author.getNickName(), author.getId()});
    }

    @Override
    public int delete(Long id) {
        return jdbcTemplate.update("delete from t_author where id = ?", id);
    }

    @Override
    public AuthorEntity findAuthor(Long id) {
        List<AuthorEntity> list = jdbcTemplate.query("select * from t_author where id = ?", new Object[]{id}, new BeanPropertyRowMapper(AuthorEntity.class));
        if(null != list && list.size()>0){
            AuthorEntity auhtor = list.get(0);
            return auhtor;
        }else{
            return null;
        }
    }

    @Override
    public List<AuthorEntity> findAuthorList() {
        List<AuthorEntity> list = jdbcTemplate.query("select * from t_author", new Object[]{}, new BeanPropertyRowMapper<AuthorEntity>(AuthorEntity.class));
        return list;
    }
}
