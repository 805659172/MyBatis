package com.gg.advise;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 */
public class MyAfterAdvise implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        after();
    }

    /**
     * 之后要要做的事
     */
    public void after(){
        System.out.println("222");
    }
}
