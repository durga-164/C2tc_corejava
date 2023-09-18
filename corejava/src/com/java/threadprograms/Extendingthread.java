package com.java.threadprograms;

public class Extendingthread  extends Thread{

public void run()//running state
{
	System.out.println("hellooo");
	
	
}

public static void main(String[]args)
{
	Extendingthread t= new Extendingthread();//new state
	t.start();//runnable state
}
}
