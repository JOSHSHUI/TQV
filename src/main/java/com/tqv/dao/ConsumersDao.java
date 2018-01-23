package com.tqv.dao;

import com.tqv.vo.Consumers;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author duke
 * @date 2018-01-23
 * @version 1.0
 */
public class ConsumersDao extends HibernateDaoSupport {

    /**
     * 用户登录
     * @param consumers
     * @return
     */
    public Consumers login(Consumers consumers) {
        String sql = "from Consurmers where c_id = ? and c_pwd = ?";
        List<Consumers> list = (List<Consumers>) this.getHibernateTemplate().find(sql,consumers.getC_id(),consumers.getC_pwd());
        if (list != null && list.size() > 0) {
            for (Consumers consumer : list) {
                consumers.setC_limit(consumer.getC_limit());
                consumers.setC_id(consumer.getC_id());
            }
            return list.get(0);
        } else {
            return null;
        }
    }

}
