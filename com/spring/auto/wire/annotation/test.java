package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/config.xml");
emp e=(emp)context.getBean("emp");
System.out.println(e);
}
}
