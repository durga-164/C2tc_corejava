package com.tns.scanner;

import java.util.Scanner;

public class Constructordemo {
 public static void main(String[]args)
 {
	 Scanner sc= new Scanner(System.in);3
	 
			 String name,city;
	int id;
	  System.out.println("enter customer id");
	  id=sc.nextInt();
	  sc.nextLine();
	  System.out.println("enter customer name");
	  name=sc.next();
	  sc.nextLine();
	  System.out.println("enter customer city");
	  city=sc.next();
	  sc.nextLine();
	  Customer c1=new Customer();//default constructor is called
	  c1.setCustomername(name);
	  c1.setCustomerid(id);
	  c1.setCustomercity(city);
 }
}
