package com.spring.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/sterotype/steroconfig.xml");
	Student student=con.getBean("student",Student.class);
System.out.println(student.hashCode());
//System.out.println(student.getAddress());
Student student3=con.getBean("student",Student.class);
System.out.println(student3.hashCode());
System.out.println(student3.getName());
}

}
