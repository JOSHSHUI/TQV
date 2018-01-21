package com.tqv.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vodka
 * @date 2018-01-21
 * @version 1.0
 */

@Entity
@Table(name = "consumers")
public class Consumers {
    private String c_id;
    private String c_pwd;
    private String c_limit;

    @Id
    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_pwd() {
        return c_pwd;
    }

    public void setC_pwd(String c_pwd) {
        this.c_pwd = c_pwd;
    }

    public String getC_limit() {
        return c_limit;
    }

    public void setC_limit(String c_limit) {
        this.c_limit = c_limit;
    }
}
