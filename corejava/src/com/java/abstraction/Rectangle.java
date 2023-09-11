package com.java.abstraction;

public class Rectangle extends Shape {
private float width,height;

public Rectangle() {
	this.width=5.0f;
	this.height=19.0f;
	
}

public Rectangle(float width, float height) {
	super();
	this.width = width;
	this.height = height;
}

@Override
void calculateArea() {
	// TODO Auto-generated method stub
	super.area=width*height;
	
			
			
}

@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}

}
