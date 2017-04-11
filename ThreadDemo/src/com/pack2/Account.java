package com.pack2;


public class Account {
	public volatile int balance;

	
	public int getBalance() {
		
		return balance;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	private void setBalance(int balance) {
		
		this.balance = balance;
	}
	
	/**
	 * @param name
	 * @param amt
	 */
	public synchronized void deposit(String name, int amt) {  //synchronized
		System.out.println(name + " trying to deposit :" + amt);
		System.out.println(name + " getting balance ");
		int bal = getBalance();
		bal += amt;
		System.out.println(name + " setting balance to :" + bal);
		setBalance(bal);
		System.out.println(name + " completes deposit");
	}

	/**
	 * @param name
	 * @param amt
	 */
	public synchronized void  withdraw(String name, int amt) {	// 
		System.out.println(name + " trying to withdraw :" + amt);
		System.out.println(name + " getting balance ");
		int bal = getBalance();
		bal -= amt;
		System.out.println(name + " setting balance to :" + bal);
		setBalance(bal);
		System.out.println(name + " completes withdraw");
	}

}
