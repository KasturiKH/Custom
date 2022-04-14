package com.xworkz.abstraction.rules;

public interface CustomCheckInRule extends CustomRule,CustomGoodsRule
{
	
	double minCheckInTime();
	
	default double maxCheckInTime() {
		System.out.println("max check in time ");
		return 10.30;
		
	}
	
	

}
