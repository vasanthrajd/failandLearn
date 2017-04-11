package com.regular;

public class MyOuter {

	private int amount=5000;
	
	public class MyInner{
		public void m1(){
			System.out.print("M1 Method "+ amount);	
		}
		
	}
}
