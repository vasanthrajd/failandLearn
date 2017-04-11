package com.pack1;

public class MyRunnable implements Runnable{  // we can extend theread to project specific

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; ++i) {
			System.out.println(Thread.currentThread().getName()
					+ " " + (i ));
		}
	}
	

}
