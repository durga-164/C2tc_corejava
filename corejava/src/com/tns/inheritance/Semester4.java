package com.tns.inheritance;
import java.util.Scanner;
public class Semester4 extends Semester3 {
	int m31,m32;
	float avg4;
	public void  sem4()
	{
		
		Scanner s4 =new Scanner(System.in);
		System.out.println("enter Java porgramming marks");
		m31=s4.nextInt();
		System.out.println("enter Java programming lab marks");
		m32=s4.nextInt();
				
			avg4=(m31+m32)/2;
	}

    public float getAvg4() {
        return avg4;
    }

	  float totalAvg() {
          return (avg1 + avg2 + avg3 + avg4) / 4;
      }
}