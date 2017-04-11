package com.regular;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter outer=new MyOuter();
		MyOuter.MyInner inner= outer.new MyInner();
		inner.m1();
		
	}

}
