package com.tns.staticprogram;
//program to demonstrate static variable
public class Employee {
     private String name;//instance variable
     private int id;
     static String companyName="tcs";
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
     
     
}
