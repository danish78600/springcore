package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dnaish {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext("com/collections/newconfig.xml");
collections name2=(collections) context.getBean("name2");
System.out.println(name2.getNames());
System.out.println(name2.getCourses());
System.out.println(name2.getCourses() .getClass().getName());
}
}
