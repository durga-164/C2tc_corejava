package com.tns.exception;

public class UserDefinedExceptionExample {
	 public static void main(String[] args) {
	        try {
	            int balance = 100;
	            int withdrawAmount = 200;

	            if (withdrawAmount > balance) {
	                throw new CustomException("Insufficient balance");
	            } else {
	                balance -= withdrawAmount;
	                System.out.println("Withdrawal successful. Updated balance: " + balance);
	            }
	        } catch (CustomException e) {
	            System.out.println("CustomException: " + e.getMessage());
	        }
	    }
}
