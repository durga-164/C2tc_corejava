package com.tns.inheritance;
import java.util.Scanner;

public class Semester2 extends Semester1 {
	int  m11,m12,m13;
	float avg2;
public void sem2()
{ 
	Scanner s2 =new Scanner(System.in);
	System.out.println("enter c++ programming marks");
	m11=s2.nextInt();
	System.out.println("enter c++ programming lab marks");
	m12=s2.nextInt();
	System.out.println("enter Allied maths-II marks");
	m13=s2.nextInt();
	
		avg2=(m11+m12+m13)/3;
		
}
public float getAvg2() {
    return avg2;
}
}
