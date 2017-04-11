package com.pack1;

public class SleepDemo {

	public static double sval = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main... starts   ");
		Series t1 = new Series();
		
		Avg t2 = new Avg();
		t2.start();
		
		t2.setName("avg");
		t1.start();
		t1.setName("series");
		System.out.println("Main... over   ");
	}

}

class Avg extends Thread {
	public void run() {
		double sum = 0.0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		
		try {
		Thread.sleep(1000);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double res = SleepDemo.sval / sum;
		System.out.println(Thread.currentThread().getName() + "over... " + res);

	}

}

class Series extends Thread {

	public void run() {
		double sum = 0.0;
		for (int i = 1; i <= 1000; i++) {
			sum = sum + i * i;
		}
		SleepDemo.sval = sum;
		System.out.println(Thread.currentThread().getName() + " over....");
	}
}
