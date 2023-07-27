package com.spring.lifecycle;

public class samosa {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	System.out.println("setting");
	this.price = price;
	
	
}

public samosa() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "samosa [price=" + price + "]";
}
public void init()
{
	System.out.println("init");
}
public void destroy()
{
	System.out.println("destroying");
}
}
