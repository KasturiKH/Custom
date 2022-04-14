package com.xworkz.abstraction.rules;

public interface CustomGoodsRule {
	
	default String[] validItems() {
		System.out.println("valid items");
		return null;
	}
	
	
	String[] nonValidItems();
	
	

}
