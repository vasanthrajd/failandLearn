package com.pack1;

public class ClientB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable r1= new MyRunnable();
		Thread t1= new Thread(r1);
		
		t1.setName("tom");
		Thread t2= new Thread(r1);
		t2.setName("sam");
		t1.start();
		t2.start();
	}

}
