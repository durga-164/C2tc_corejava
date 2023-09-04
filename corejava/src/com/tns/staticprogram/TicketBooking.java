package com.tns.staticprogram;

public class TicketBooking {
	
	
	    // Static variable to store the number of available tickets
	    private static int availableTickets = 10;

	    public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	            // Simulate a person booking a ticket
	            bookTicket(i);
	        }
	    }

	    public static void bookTicket(int personNumber) {
	        if (availableTickets > 0) {
	            System.out.println("Person " + personNumber + " booked a ticket. Available tickets: " + availableTickets);
	            availableTickets--;
	        } else {
	            System.out.println("Sorry, no more tickets available for person " + personNumber);
	        }
	    }
	}

