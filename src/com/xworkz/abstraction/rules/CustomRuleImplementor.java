package com.xworkz.abstraction.rules;

public class CustomRuleImplementor implements CustomRule,CustomGoodsRule,CustomCheckInRule{

	public boolean validPassport() {
		System.out.println("valid passport " +this.getClass().getSimpleName());
		return true;
	}


	
	public String bookedTickets() {
		System.out.println("booked tickets "+this.getClass().getSimpleName());
		return "Bangalore";
	}

	

	

	@Override
	public double minCheckInTime() {
		System.out.println("min check in time" +this.getClass().getSimpleName());
		return 9.30;
	}



	@Override
	public String[] nonValidItems() {
		System.out.println("non valid items");
		return null;
	}

	

	

	

	
	}


