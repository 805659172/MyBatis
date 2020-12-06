package com.gg.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /*
    *   得到代理对象
    * */
    public Object  getProxyInstance(){
        /**
         * 参数说明
         * ClassLoader loader :类加载器
         * Class<?>[] interfaces：目标实现的所有接口数组
         * InvocationHandler h：当代理对象被创建后，调用目标对象的方法时触发的方法回调
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             * @param method 用户要调用的目标对象的方法
             * @param args 目标对象的方法参数
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                begin();//前置加强
                //开始执行目标对象的方法
                Object object = method.invoke(target, args);
                end();//后置加强
                return object;
            }
        });
    }

    public void begin(){
        System.out.println("开启事务");
    }

    public void end(){
        System.out.println("结束事务");
    }

}
