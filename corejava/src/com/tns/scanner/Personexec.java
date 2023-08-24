package com.tns.scanner;
import java.util.Scanner;

public class Personexec {
    public static void main(String[]args)
    {
    	Scanner ob=new Scanner(System.in);
    	String name;
    	System.out.println("enter person name");
    	name=ob.next();
    	System.out.println("enter income");
    	int income =ob.nextInt();
    	
    	Person pp=new Person();
    	pp.setName(name);
    	pp.setIncome(income);
        Calculation calc =new Calculation();
        calc.cls(pp);
        System.out.println("after calculation the tax is ");
        System.out.println(pp);
    }
}
