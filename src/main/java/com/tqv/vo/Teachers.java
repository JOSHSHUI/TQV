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
@Table(name = "teachers")
public class Teachers {
    private String tea_id;
    private String tea_name;
    private String tea_gender;
    private String tea_age;
    private String tea_title;
    private String tea_pol;
    private String tea_num;
    private String tea_add;
    private String tea_tel;
    private String tea_edu;
    private String tea_limit;
    private String tea_pic;

    @Id
    public String getTea_id() {
        return tea_id;
    }

    public void setTea_id(String tea_id) {
        this.tea_id = tea_id;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

    public String getTea_gender() {
        return tea_gender;
    }

    public void setTea_gender(String tea_gender) {
        this.tea_gender = tea_gender;
    }

    public String getTea_age() {
        return tea_age;
    }

    public void setTea_age(String tea_age) {
        this.tea_age = tea_age;
    }

    public String getTea_title() {
        return tea_title;
    }

    public void setTea_title(String tea_title) {
        this.tea_title = tea_title;
    }

    public String getTea_pol() {
        return tea_pol;
    }

    public void setTea_pol(String tea_pol) {
        this.tea_pol = tea_pol;
    }

    public String getTea_num() {
        return tea_num;
    }

    public void setTea_num(String tea_num) {
        this.tea_num = tea_num;
    }

    public String getTea_add() {
        return tea_add;
    }

    public void setTea_add(String tea_add) {
        this.tea_add = tea_add;
    }

    public String getTea_tel() {
        return tea_tel;
    }

    public void setTea_tel(String tea_tel) {
        this.tea_tel = tea_tel;
    }

    public String getTea_edu() {
        return tea_edu;
    }

    public void setTea_edu(String tea_edu) {
        this.tea_edu = tea_edu;
    }

    public String getTea_limit() {
        return tea_limit;
    }

    public void setTea_limit(String tea_limit) {
        this.tea_limit = tea_limit;
    }

    public String getTea_pic() {
        return tea_pic;
    }

    public void setTea_pic(String tea_pic) {
        this.tea_pic = tea_pic;
    }
}
