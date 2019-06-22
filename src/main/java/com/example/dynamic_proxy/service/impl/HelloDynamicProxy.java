package com.example.dynamic_proxy.service.impl;

import com.example.dynamic_proxy.service.Hello;

/**
 * @author yanlianglong
 * @Title: HelloDynamicProxy.java
 * @Package com.example.dynamic_proxy.service.impl
 * @Description:
 * @date 2019/6/22 11:36
 */
public class HelloDynamicProxy implements Hello {
    @Override
    public void Hello() {
        System.out.println("Hello DynamicProxy!");
    }
}
