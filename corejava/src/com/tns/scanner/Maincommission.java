package com.tns.scanner;

public class Maincommission
{
	public static void main(String[]args)//main method to create object 
	{
		Commission s=new Commission();//creating object for Commission class
		s.getinput();//calling input method
		s.calcamount();//calling calcamount method to calculate the amount
		  System.out.println(s);
	}

}
