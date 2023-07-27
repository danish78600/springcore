package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/auto/wire/config.xml");
emp e=(emp)context.getBean("emp");
System.out.println(e);
}
}
