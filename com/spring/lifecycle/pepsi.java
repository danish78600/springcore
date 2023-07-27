package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public pepsi() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "pepsi [price=" + price + "]";
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("takign pepsi i am init");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("throw bottle i am destoy");
}

}
