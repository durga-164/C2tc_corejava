package com.tns.inheritance;
import java.util.Scanner;

public class Semester1 {
    int m1, m2, m3;
    float avg1; // Declare avg1 as an instance variable

    public void sem1() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter C programming marks: ");
        m1 = s1.nextInt();
        System.out.println("Enter C programming lab marks: ");
        m2 = s1.nextInt();
        System.out.println("Enter C programming allied maths-I marks: ");
        m3 = s1.nextInt();

        avg1 = (m1 + m2 + m3) / 3;
    }

    public float getAvg1() {
        return avg1;
    }
}
