package com.tns.inheritance;

public class Multilevelexample2 {

	public static void main(String args[]) 
	{
		 Semester4 obj = new Semester4();
		 obj.sem1();
		 obj.sem2();
		 obj.sem3();
		 obj.sem4();
	        System.out.println("semester 1 avg: " + obj.getAvg1());
	        System.out.println("semester 2 avg: " + obj.getAvg2());
	        System.out.println("semester 3 avg: " + obj.getAvg3());
	        System.out.println("semester 4 avg: " + obj.getAvg4());

	        System.out.println("total average: " + obj.totalAvg());
}
}