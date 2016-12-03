package org.smart4j.framework.test.service;

import org.smart4j.framework.annotation.Service;

/**
 * Service注解测试类
 * @author lienquan
 * @since 1.0.0
 */
@Service
public class Test2Service {


    private String name;

    private String serviceType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
