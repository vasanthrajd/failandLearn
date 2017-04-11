package com.stat;

public class MyOuter {	// super class is Object member
	private int amount=5000;
	private static int totAmt=50000;
	public static class MyInner{		// super class is Object member
		public void m1(){	
			System.out.println("Inner Class" +totAmt);
		}
	}
}
