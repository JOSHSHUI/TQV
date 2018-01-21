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
@Table(name = "students")
public class Students {
    private String stu_id;
    private String stu_name;
    private String stu_gender;
    private String stu_age;
    private String stu_cate;
    private String stu_pol;
    private String stu_duty;
    private String stu_class;
    private String stu_date;
    private String stu_num;
    private String stu_add;
    private String stu_parent;
    private String stu_tel;
    private String stu_roll;
    private String stu_place;
    private String stu_pic;

    @Id
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_gender() {
        return stu_gender;
    }

    public void setStu_gender(String stu_gender) {
        this.stu_gender = stu_gender;
    }

    public String getStu_age() {
        return stu_age;
    }

    public void setStu_age(String stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_cate() {
        return stu_cate;
    }

    public void setStu_cate(String stu_cate) {
        this.stu_cate = stu_cate;
    }

    public String getStu_pol() {
        return stu_pol;
    }

    public void setStu_pol(String stu_pol) {
        this.stu_pol = stu_pol;
    }

    public String getStu_duty() {
        return stu_duty;
    }

    public void setStu_duty(String stu_duty) {
        this.stu_duty = stu_duty;
    }

    public String getStu_class() {
        return stu_class;
    }

    public void setStu_class(String stu_class) {
        this.stu_class = stu_class;
    }

    public String getStu_date() {
        return stu_date;
    }

    public void setStu_date(String stu_date) {
        this.stu_date = stu_date;
    }

    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    public String getStu_add() {
        return stu_add;
    }

    public void setStu_add(String stu_add) {
        this.stu_add = stu_add;
    }

    public String getStu_parent() {
        return stu_parent;
    }

    public void setStu_parent(String stu_parent) {
        this.stu_parent = stu_parent;
    }

    public String getStu_tel() {
        return stu_tel;
    }

    public void setStu_tel(String stu_tel) {
        this.stu_tel = stu_tel;
    }

    public String getStu_roll() {
        return stu_roll;
    }

    public void setStu_roll(String stu_roll) {
        this.stu_roll = stu_roll;
    }

    public String getStu_place() {
        return stu_place;
    }

    public void setStu_place(String stu_place) {
        this.stu_place = stu_place;
    }

    public String getStu_pic() {
        return stu_pic;
    }

    public void setStu_pic(String stu_pic) {
        this.stu_pic = stu_pic;
    }
}
