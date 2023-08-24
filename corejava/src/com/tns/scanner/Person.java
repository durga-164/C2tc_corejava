package com.tns.scanner;

public class Person {
   @Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
	}
private String name;
   public String getName() {
	return name;
}
public int getIncome() {
	return income;
}
public int getTax() {
	return tax;
}
public void setName(String name) {
	this.name = name;
}
public void setIncome(int income) {
	this.income = income;
}
public void setTax(int tax) {
	this.tax = tax;
}
private int income;
   private int tax;
   
}
