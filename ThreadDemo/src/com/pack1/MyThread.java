package com.pack1;

public class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 100; ++i) {
			Thread.yield();			/// Yield the priority of the thread and then it will be executed by using the priority
			System.out.println(Thread.currentThread().getName()
					+ " " + (i ));
		}
	}
}
