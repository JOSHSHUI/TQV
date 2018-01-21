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
@Table(name = "exams")
public class Exams {
    private String ex_id;
    private String ex_name;
    private String ex_sub;
    private String ex_date;
    private String ex_limit;

    @Id
    public String getEx_id() {
        return ex_id;
    }

    public void setEx_id(String ex_id) {
        this.ex_id = ex_id;
    }

    public String getEx_name() {
        return ex_name;
    }

    public void setEx_name(String ex_name) {
        this.ex_name = ex_name;
    }

    public String getEx_sub() {
        return ex_sub;
    }

    public void setEx_sub(String ex_sub) {
        this.ex_sub = ex_sub;
    }

    public String getEx_date() {
        return ex_date;
    }

    public void setEx_date(String ex_date) {
        this.ex_date = ex_date;
    }

    public String getEx_limit() {
        return ex_limit;
    }

    public void setEx_limit(String ex_limit) {
        this.ex_limit = ex_limit;
    }
}
