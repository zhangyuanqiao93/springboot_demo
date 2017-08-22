package com.imooc.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Create By Bridge On 2017/8/22
 * Function:  数据库数据用echarts显示；
 * Description:
 */
@Entity
@Table(name = "t_app_test")
public class UserEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    @Column(length = 32)
    private int id;
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String version;
    @Column(length = 32)
    private int app_id;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String verison) {
        this.version = verison;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }


}
