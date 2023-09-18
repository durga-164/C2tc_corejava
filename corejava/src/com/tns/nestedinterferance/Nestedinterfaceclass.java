package com.tns.nestedinterferance;

public class Nestedinterfaceclass implements MyInterface.MyinnerInterface {
public static char[] id;

@Override
public void print()
{
	System.out.println("interface print");
}
}
