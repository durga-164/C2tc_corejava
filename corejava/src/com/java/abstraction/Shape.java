package com.java.abstraction;

public abstract class Shape {
   protected float area;
   abstract void calculateArea();//abstract method
void show()//concrete method
{
	System.out.println("area of the shape is"+area);
	
}
}
