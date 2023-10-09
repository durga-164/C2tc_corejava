package com.java.lamdaprograms;



public class WithParameterdemo {

    public static void main(String[] args) {
        Cube c = (a) -> { return a * a * a; };
        System.out.println("Cube of a number is " + c.calculate(5));

        Square s = (x) -> { return x * x; };
        System.out.println("Square of a number is " + s.calculate(5));
    }
}
