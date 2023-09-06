package com.tns.inheritance;
import java.util.Scanner;
public class Semester3 extends Semester2 {
	int m21,m22;
	float avg3;
	public void sem3()
	{
		
		Scanner s3 =new Scanner(System.in);
		System.out.println("enter RDBMS marks");
		m21=s3.nextInt();
		System.out.println("enter PHP lab marks");
		m22=s3.nextInt();
				
			avg3=(m21+m22)/2;
	}
	 public float getAvg3() {
	        return avg3;
	    }
}
