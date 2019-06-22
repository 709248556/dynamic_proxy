package com.example.dynamic_proxy.service.impl;

import com.example.dynamic_proxy.service.Hello;

/**
 * @author yanlianglong
 * @Title: HelloWorld.java
 * @Package com.example.dynamic_proxy.service.impl
 * @Description:
 * @date 2019/6/22 11:31
 */
public class HelloWorld implements Hello {
    @Override
    public void Hello() {
        System.out.println("Hello World!");
    }
}
