package com.springcore.constructorinject;

public class addition {
private int a;
private int b;

public addition(double a,double b)
{
	this.a=(int)a;
	this.b=(int)b;
	System.out.println("i am double constructor");
}

public addition(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println("i am int constructor");
	
}
public addition(String a,String b)
{
	this.a=Integer.parseInt(a);
	this.b=Integer.parseInt(b);
	System.out.println("i am a string constructor");
}

public void dosum()
{
	System.out.println("value of a is "+this.a);
	System.out.println("value of b is "+this.b);
	System.out.println(this.a+this.b);
}



}
