package com.java.lamdaprograms;

import java.sql.Statement;


public class WithoutParameter {
  public static void main(String[]args) 
  {
	  Message s=()->{return "helloo";};
	  System.out.println(s.green());
	  
  }
}
