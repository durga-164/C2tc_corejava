package com.tns.inheritance;

public class Main {
public static void main(String[]args)
{
   Lion obj=new Lion();//an object called obj is created for the last child class Lion
   obj.wild();//Animal class method is called
   obj.pet();//Animal class method is called
   obj.lion();//Wildanimal class method is called
   obj.wolf();//Wildanimal class method is called
   obj.lionandcub();//Lion class method is called
}
}
