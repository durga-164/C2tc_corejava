package com.tns.staticprogram;
//to demonstrate static block and method
public class Myclass {
  private int section ;
  private static int srNo;
  static {
	  System.out.println("static block..");
	  srNo=100;
	  
  }
  Myclass()
  {
	  System.out.println("default constructor");
	  section++;
	  srNo++;
	  
  }
  static void display()
  {
	  System.out.println("serial number"+srNo);
	  
	  
  }
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}
}
