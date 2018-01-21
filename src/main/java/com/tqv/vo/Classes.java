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
@Table(name = "classes")
public class Classes {
    private String class_id;
    private String class_tea_name;
    private String class_type;

    @Id
    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getClass_tea_name() {
        return class_tea_name;
    }

    public void setClass_tea_name(String class_tea_name) {
        this.class_tea_name = class_tea_name;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }
}
