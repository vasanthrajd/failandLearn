package com.sasken.client;

import com.sasken.service.BlockDemo;

public class ClientB {

	/**
	 * @param args
	 */
	static{
		System.out.println("Static Block....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// As soon as the class is loaded , static will load once
		BlockDemo b1=new BlockDemo();
		BlockDemo b2=new BlockDemo();
	b1=null;	
	}

}
