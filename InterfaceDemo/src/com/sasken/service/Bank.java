package com.sasken.service;

public class Bank implements Atm, Agent {

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Get Balance ..");
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("WithDraw ...");
	}

	@Override
	public void calcComm() {
		// TODO Auto-generated method stub
		System.out.println("Calc Comm....");		
	}

	@Override
	public void clearPdc() {
		// TODO Auto-generated method stub
		System.out.println("Clear PDC");
	}

}
