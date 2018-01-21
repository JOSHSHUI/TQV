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
@Table(name = "courses")
public class Courses {
    private String cou_id;
    private String cou_name;
    private String cou_tea_name;

    @Id
    public String getCou_id() {
        return cou_id;
    }

    public void setCou_id(String cou_id) {
        this.cou_id = cou_id;
    }

    public String getCou_name() {
        return cou_name;
    }

    public void setCou_name(String cou_name) {
        this.cou_name = cou_name;
    }

    public String getCou_tea_name() {
        return cou_tea_name;
    }

    public void setCou_tea_name(String cou_tea_name) {
        this.cou_tea_name = cou_tea_name;
    }
}
