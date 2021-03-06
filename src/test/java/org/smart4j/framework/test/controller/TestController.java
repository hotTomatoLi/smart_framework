package org.smart4j.framework.test.controller;

import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.test.service.Test2Service;
import org.smart4j.framework.test.service.Test3Service;
import org.smart4j.framework.test.service.TestService;

/**
 * controller测试类
 * @author lienquan
 * @since 1.0.0
 */
@Controller
public class TestController {

    @Inject
    private Test2Service test2Service;

    @Inject
    private TestService testService;

    @Inject
    private Test3Service test3Service;


    public Test2Service getTest2Service() {
        return test2Service;
    }

    public void setTest2Service(Test2Service test2Service) {
        this.test2Service = test2Service;
    }

    public TestService getTestService() {
        return testService;
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    public Test3Service getTest3Service() {
        return test3Service;
    }

    public void setTest3Service(Test3Service test3Service) {
        this.test3Service = test3Service;
    }
}
