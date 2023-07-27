package com.springcore.constructorinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/constructorinject/ciconfig.xml");
	person p=(person)context.getBean("person");
	System.out.println(p);
addition add=(addition)	context.getBean("add");
add.dosum();
}
}
