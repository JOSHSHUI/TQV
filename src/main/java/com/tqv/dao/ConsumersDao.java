package com.tqv.dao;

import com.tqv.vo.Consumers;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author vodka
 * @date 2018-01-25
 * @version 1.0
 */

public class ConsumersDao extends HibernateDaoSupport {

    /**
     * 登录
     * @param consumers
     * @return
     */
    public boolean login(Consumers consumers) {
        String hql = "from Consumers where c_id = ? and c_pwd = ?";
        List<Consumers> list = (List<Consumers>) this.getHibernateTemplate().find(hql,
                consumers.getC_id(), consumers.getC_pwd());
        for (Consumers consumer : list) {
            consumers.setC_id(consumer.getC_id());
            consumers.setC_pwd(consumer.getC_pwd());
            consumers.setC_limit(consumer.getC_limit());
        }

        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
