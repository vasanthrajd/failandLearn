package com.pack1;

public class JointDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.setName("tom");
		
		MyThread t2 = new MyThread();
		t2.setName("sam");

		t1.start();	// Starting the thread execution..
		t1.join();
		
		t2.start();
		t2.join();
		
		System.out.println("Main thread completed");
		for (int i = 1; i <= 100; ++i) {
			System.out.println(Thread.currentThread().getName()
					+ " " + (i ));
		}
			}
}
