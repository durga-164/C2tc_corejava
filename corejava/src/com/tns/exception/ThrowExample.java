package com.tns.exception;

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18 years");
        }

        System.out.println("Age is valid.");
    }
}
