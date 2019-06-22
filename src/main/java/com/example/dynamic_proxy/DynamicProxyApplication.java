package com.example.dynamic_proxy;

import com.example.dynamic_proxy.dynamic.proxy.DynamicProxy;
import com.example.dynamic_proxy.service.Hello;
import com.example.dynamic_proxy.service.impl.HelloDynamicProxy;
import com.example.dynamic_proxy.service.impl.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Proxy;

@SpringBootApplication
public class DynamicProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicProxyApplication.class, args);
		//创建中介类实例
		DynamicProxy helloWorldInter = new DynamicProxy(new HelloWorld());
		DynamicProxy helloDynamicProxyInter = new DynamicProxy(new HelloDynamicProxy());
		//加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

		//获取代理类实例
		Hello helloWorld = (Hello)(Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class}, helloWorldInter));
		Hello helloDynamicProxy = (Hello)(Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class}, helloDynamicProxyInter));

		//通过代理类对象调用代理类方法，实际上会转到invoke方法调用
		helloWorld.Hello();
		helloDynamicProxy.Hello();
	}

}
