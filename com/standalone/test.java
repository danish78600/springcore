package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/standalone/aloneconfig.xml");
	person p=(person)context.getBean("person1");
	System.out.println(p);
}
}
