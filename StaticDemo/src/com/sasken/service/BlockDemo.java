package com.sasken.service;

public class BlockDemo {
	static{
		System.out.println("Static Block....");
	}
	{
	System.out.println("Instance Block....");
	}
	public BlockDemo(){
		System.out.println("Constructor Block...");
	}
}
