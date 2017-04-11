package com.pack1;

public class ClientA {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("tom");
		t1.setPriority(1);
		MyThread t2 = new MyThread();
		t2.setName("sam");
		t2.setPriority(9);
		
		t1.start();				// Starting the thread execution..
		t2.start();
		
		System.out.println("Main thread completed");
		for (int i = 1; i <= 100; ++i) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()
					+ " " + (i ));
		}
			}

}
