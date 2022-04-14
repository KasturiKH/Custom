package com.xworkz.abstraction;

import com.xworkz.abstraction.rules.CustomCheckInRule;
import com.xworkz.abstraction.rules.CustomGoodsRule;
import com.xworkz.abstraction.rules.CustomRule;
import com.xworkz.abstraction.rules.CustomRuleImplementor;

public class CustomRuleRunner {

	public static void main(String[] args) {
		
		CustomRule customRule=new CustomRuleImplementor();
		boolean pass =customRule.validPassport();
		System.out.println(pass);
		
		
		
		boolean bag =customRule.baggageCheckIn();
		System.out.println(bag);
		
		String book =customRule.bookedTickets();
		System.out.println(book);
		
		
		CustomCheckInRule customCheckInRule=(CustomCheckInRule)customRule;
		
		double mTime=customCheckInRule.minCheckInTime();
		System.out.println(mTime);
		
		
		double maTime=customCheckInRule.maxCheckInTime();
		System.out.println(maTime);
		
		
		CustomGoodsRule customGoodsRule=(CustomGoodsRule)customRule;
		String[] iteam=customGoodsRule.validItems();
		System.out.println();
		
		String[] it=customGoodsRule.nonValidItems();
		System.out.println();
		
		
		
		
		
		
		
		

	}

}
		