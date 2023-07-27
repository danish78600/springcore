package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
//samosa s=(samosa)context.getBean("s1");
//System.out.println(s);
context.registerShutdownHook();
//
//System.out.println("************************");
//
//pepsi p1=(pepsi)context.getBean("p1");
//System.out.println(p1);
example examplee=(example)context.getBean("examplee");
System.out.println(examplee);
}
}
