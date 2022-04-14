package com.xworkz.abstraction.rules;

public interface CustomRule {
	
	boolean validPassport();
	
	default boolean baggageCheckIn() {
		
		System.out.println("baggage check in");
		return false;
	}
	
	
	
	
	String bookedTickets();

}
