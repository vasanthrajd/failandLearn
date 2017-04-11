package com.stat;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter.MyInner inner=new MyOuter.MyInner();  // no need to create the 
    	//outer class reference for creating objects for static inner class
		// above implies the two different classes, 
		
	}

}
