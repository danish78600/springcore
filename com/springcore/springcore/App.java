package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
      index index=(index) context.getBean("index1");
      index index2=(index) context.getBean("index2");
      System.out.println(index);
      System.out.println(index2);
    }
}
