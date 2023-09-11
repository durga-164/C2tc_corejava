package com.tns.finalvariable;
//program to demonstrate final method
public class Finalmethod {
    Finalmethod()
    {
    	System.out.println("default constructor");
    }
    final int a=22;
    //final method
    final void show()
    {
    	System.out.println("value of a"+a);
    }
}
