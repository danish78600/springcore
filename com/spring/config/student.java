package com.spring.config;

import org.springframework.stereotype.Component;


//@Component
public class student {
	private Samosa samosa;
public Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
public student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
public void dan()
{
	this.samosa.dis();
	System.out.println("i am new dnaish");
}
}
