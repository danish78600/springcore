package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	
private Address address;



public emp(Address address) {
	super();
	this.address = address;
	System.out.println("auto in constructr");
}

public emp() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "emp [address=" + address + "]";
}

public Address getAddress() {
	return address;
}

@Autowired

public void setAddress(Address address) {
	this.address = address;
	System.out.println("auto in setter");
}
}
