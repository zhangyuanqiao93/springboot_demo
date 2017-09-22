package com.imooc.demo.entity;

import javax.persistence.Entity;

/**
 * Create By Bridge On 2017/9/22
 * Function:
 * Description:
 */

@Entity
public class AuthorEntity {

    private Long id;
    private String realName;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
