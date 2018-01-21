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
@Table(name = "title")
public class Title {
    private String tit_id;
    private String tit_name;

    @Id
    public String getTit_id() {
        return tit_id;
    }

    public void setTit_id(String tit_id) {
        this.tit_id = tit_id;
    }

    public String getTit_name() {
        return tit_name;
    }

    public void setTit_name(String tit_name) {
        this.tit_name = tit_name;
    }
}
