package com.example.dynamic_proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yanlianglong
 * @Title: DynamicProxy.java
 * @Package com.example.dynamic_proxy.dynamic.proxy
 * @Description:
 * @date 2019/6/22 11:32
 */
public class DynamicProxy implements InvocationHandler {
    //obj为委托类对象;
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(obj, args);
        System.out.println("after");
        return result;
    }
}
