package com.sushil.compoundServlets;

public class Utils {
	
	public static double calculateCompoundInterest(double principal, double interest, int years, int compoundingPeriod) {
		
		
		return principal * Math.pow(1 + (interest / compoundingPeriod) , (compoundingPeriod * years));
	}
	
	public static String kaboom() {
		
		return "Hello from method Utils";
	}

}
