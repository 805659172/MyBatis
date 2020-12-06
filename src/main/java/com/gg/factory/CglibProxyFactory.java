package com.gg.factory;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CglibProxyFactory implements MethodInterceptor {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /*
    *   得到代理对象
    * */
    public Object  getProxyInstance(){
        /*1、创建一个子类对象的构造器*/
        Enhancer enhancer = new Enhancer();
        /*2、设置父类*/
        enhancer.setSuperclass(target.getClass());
        /*3、设置回调*/
        enhancer.setCallback(this);
        /*4、再内存里面生成代理对象*/
        return enhancer.create();
    }

    public void begin(){
        System.out.println("开启事务");
    }

    public void end(){
        System.out.println("结束事务");
    }

    /**
     * 目标对象所调用的方法
     * @param o obj目标对象
     * @param method 目标对象所调用的方法
     * @param objects 参数
     * @param methodProxy 方法代理
     * @return 代理对象
     * @throws Throwable 异常
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        begin();//前置加强
        Object invoke = method.invoke(target, objects);
        end();//后置加强
        return invoke;
    }
}
