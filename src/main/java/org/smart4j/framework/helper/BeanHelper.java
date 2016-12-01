package org.smart4j.framework.helper;

import org.smart4j.framework.util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Bean工具，实例化所有的bean
 * @author lienquan
 * @since 1.0.0
 */
public class BeanHelper {

    /**
     * bean map
     */
    public static final Map<Class<?>,Object> BEAN_MAP = new HashMap<Class<?>, Object>();

    /**
     * 实例化所有bean
     */
    static{
        for(Class<?> cls : ClassHelper.getBeanClassSet()){
            Object object = ReflectionUtil.newInstance(cls);
            BEAN_MAP.put(cls,object);
        }
    }

    /**
     * 获取Bean map
     * @return
     */
    public static Map<Class<?>, Object> getBeanMap(){
        return BEAN_MAP;
    }

    /**
     * 获取bean对象
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> cls){
        if(!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get bean by class:" + cls);
        }
        return (T)BEAN_MAP.get(cls);
    }

}
