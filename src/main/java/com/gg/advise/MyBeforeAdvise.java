package com.gg.advise;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知
 */
public class MyBeforeAdvise implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        before();
    }

    /**
     * 之前要做的事
     */
    public void before(){
        System.out.println("111");
    }

}
