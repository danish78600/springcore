package com.spring.config;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
ApplicationContext context	=new AnnotationConfigApplicationContext(config.class);
	student s=context.getBean("kartik",student.class);
	System.out.println(s);
	s.dan();
}
}
