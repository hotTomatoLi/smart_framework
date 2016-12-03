package org.smart4j.framework.test.service;


import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;

/**
 * Service注解测试类
 * @author lienquan
 * @since 1.0.0
 */
@Service
public class Test3Service {

    @Inject
    private Test2Service test2Service;

    @Inject
    private TestService testService;


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
}
