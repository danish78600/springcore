package com.spring.bool;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class kartik {
	@Value("#{21+21}")
private int x;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

@Override
public String toString() {
	return "kartik [x=" + x + "]";
}

public kartik() {
	super();
	// TODO Auto-generated constructor stub
}

}
