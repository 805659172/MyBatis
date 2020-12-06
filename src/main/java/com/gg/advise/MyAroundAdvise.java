package com.gg.advise;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvise implements MethodInterceptor {

    /**
     *
     * @param methodInvocation 目标方法执行对象
     * @return 代理对象
     * @throws Throwable 异常
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        long time1 = System.currentTimeMillis();
        /*执行目标对象的方法*/
        Object proceed = methodInvocation.proceed();
        long time2 = System.currentTimeMillis();
        after();
        System.out.println("方法耗时：" + (time2-time1));
        return proceed;
    }

    /**
     * 之前要做的事
     */
    public void before() {
        System.out.println("哈哈");
    }

    /**
     * 之后要做的事
     */
    public void after(){
        System.out.println("嘎嘎");
    }
}
