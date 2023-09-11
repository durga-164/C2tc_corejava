package com.java.abstraction;

public class MainDemo {
public static void main(String[]args)
{
	Square sq=new Square();
	Rectangle r=new Rectangle();
	System.out.println(sq);
	System.out.println(r);
	sq.calculateArea();
	r.calculateArea();
}
}
