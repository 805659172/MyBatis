package com.gg.advise;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 */
public class MyExceptionAdvise implements ThrowsAdvice {

    /**
     * 异常增强方法
     * @param ta 异常类
     * @throws Exception 抛出异常
     */
    public void afterThrowing(Throwable ta) throws Exception{
        System.out.println("产生异常：" + ta.getMessage());
    }

}
