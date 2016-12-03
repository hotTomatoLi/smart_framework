package org.smart4j.framework;

import org.junit.Test;
import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.test.controller.Test2Controller;
import org.smart4j.framework.test.controller.TestController;

import java.util.Map;

/**
 * HelperLoader测试类
 * @author lienquan
 * @since 1.0.0
 *
 */
public class HelperLoaderTest {

    @Test
    public void testInit(){
        HelperLoader.init();
        for(Map.Entry<Class<?>,Object> entry : BeanHelper.BEAN_MAP.entrySet()){
            Class<?> cls = entry.getKey();
            Object object = entry.getValue();
            System.out.println(cls);
            System.out.println(object);
        }
        TestController testController = BeanHelper.getBean(TestController.class);
        Test2Controller test2Controller = BeanHelper.getBean(Test2Controller.class);
        System.out.println(testController.getTestService());
        System.out.println(test2Controller.getTestService());
        System.out.println(testController.getTest2Service());
        System.out.println(test2Controller.getTest2Service());

        System.out.println(testController.getTest3Service().getTestService());
        System.out.println(testController.getTest3Service().getTest2Service());
    }
}
