package com.spring.bool;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class danish {
public static void main(String[] args) {
ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/bool/config.xml");
kartik k=(kartik)context.getBean("kartik");
System.out.println(k);
	SpelExpressionParser s=new SpelExpressionParser();
	Expression expression=s.parseExpression("#21+12");
	System.out.println(expression.getValue());
}
}
