package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.lifecycle.samosa;
import com.spring.sterotype.Student;

@Configuration
//@ComponentScan(basePackages = "com.spring.config" )
public class config {
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	
	@Bean(name={"danish","kartik"})
public student getStudent()
{
	//creating new object
	student studentt=new student(getSamosa());
	return studentt;
}
	
}
