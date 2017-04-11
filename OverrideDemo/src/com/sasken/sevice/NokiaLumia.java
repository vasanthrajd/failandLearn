package com.sasken.sevice;

public class NokiaLumia extends Nokia1100{

	public NokiaLumia()
	{
		System.out.println("Sub Class Cons");
	}
	public void doConverse(){
		System.out.println("Sub Class Lumia - do converse");
	}
	
	public void capture(){
		System.out.println("Sub Class Lumia Capture Img");
	}
	
	public void doConverseOld()
	{
		super.doConverse();
	}
}
