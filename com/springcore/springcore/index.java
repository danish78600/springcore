package com.springcore.springcore;

public class index {
private String name;
private int no;


public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setting name");
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}


@Override
public String toString() {
	return "index [name=" + name + ", no=" + no + "]";
}
public index() {
	super();
	// TODO Auto-generated constructor stub
}
public index(String name, int no) {
	super();
	this.name = name;
	this.no = no;
}



}
