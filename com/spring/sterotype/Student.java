package com.spring.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
//	@Value("#{21+21}")
	@Value("dnaijsh")
private String name;

	@Value("#{temp}")
private List<String> address;

public List<String> getAddress() {
		return address;
	}


	public void setAddress(List<String> address) {
		this.address = address;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [name=" + name + "]";
}
}
