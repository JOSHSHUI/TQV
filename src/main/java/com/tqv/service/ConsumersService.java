package com.tqv.service;

import com.tqv.dao.ConsumersDao;
import com.tqv.vo.Consumers;

public class ConsumersService {

    private ConsumersDao consumersDao;

    /**
     * 用户登录
     * @param consumers
     * @return
     */
    public Consumers login(Consumers consumers) {
        return  consumersDao.login(consumers);
    }

    public ConsumersDao getConsumersDao() {
        return consumersDao;
    }

    public void setConsumersDao(ConsumersDao consumersDao) {
        this.consumersDao = consumersDao;
    }

}   
    