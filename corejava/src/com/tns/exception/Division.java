package com.tns.exception;
//try with multiple catch block
public class Division {
  public static void divide()
  {
	  int a=6,b=0,c;
	  try {
		  c=a/b;
		  System.out.println("division is "+c);
		  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("divsion answer"+e.getMessage());
	  }
  }
}
