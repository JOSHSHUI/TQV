package com.tqv.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tqv.service.ConsumersService;
import com.tqv.vo.Consumers;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;

/**
 * @author duke
 * @date 2018-01-23
 * @version 1.0
 */
public class ConsumerAction extends ActionSupport implements ModelDriven<Consumers> {

    private Consumers consumers = new Consumers();
    private ConsumersService consumersService;

    /**
     * 用户登录
     * @return
     */
    public String login() {
        Consumers consumer = consumersService.login(consumers);
        if (consumer == null) {
            return INPUT;
        } else {
            ServletContext application = ServletActionContext.getServletContext();
            application.setAttribute("limit",consumer.getC_limit());
            application.setAttribute("c_id",consumer.getC_id());
            return SUCCESS;
        }
    }

    public Consumers getModel() {
        return consumers;
    }
    public ConsumersService getConsumersService() {
        return consumersService;
    }

    public void setConsumersService(ConsumersService consumersService) {
        this.consumersService = consumersService;
    }

}
