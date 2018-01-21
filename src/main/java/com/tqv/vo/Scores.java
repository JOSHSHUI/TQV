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
@Table(name = "scores")
public class Scores {
    private String sc_stu_id;
    private String sc_cou_id;
    private String sc_scores;
    private String sc_tea_id;
    private String sc_ex_id;

    @Id
    public String getSc_stu_id() {
        return sc_stu_id;
    }

    public void setSc_stu_id(String sc_stu_id) {
        this.sc_stu_id = sc_stu_id;
    }

    public String getSc_cou_id() {
        return sc_cou_id;
    }

    public void setSc_cou_id(String sc_cou_id) {
        this.sc_cou_id = sc_cou_id;
    }

    public String getSc_scores() {
        return sc_scores;
    }

    public void setSc_scores(String sc_scores) {
        this.sc_scores = sc_scores;
    }

    public String getSc_tea_id() {
        return sc_tea_id;
    }

    public void setSc_tea_id(String sc_tea_id) {
        this.sc_tea_id = sc_tea_id;
    }

    public String getSc_ex_id() {
        return sc_ex_id;
    }

    public void setSc_ex_id(String sc_ex_id) {
        this.sc_ex_id = sc_ex_id;
    }
}
