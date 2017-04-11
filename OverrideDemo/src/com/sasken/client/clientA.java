package com.sasken.client;

import com.sasken.sevice.Nokia1100;
import com.sasken.sevice.NokiaLumia;

public class clientA {
	public clientA() {
		System.out.println("Main Cons");
	}
	public static void main(String[] args)
	{
		NokiaLumia mob=new NokiaLumia();
		mob.doConverse();
		mob.sendSms();
		mob.capture();
	}
	
}
