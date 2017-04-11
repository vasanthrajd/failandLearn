package com.sasken.service;

public class SalesPerson {
	private int sales;
	public static int totSales;
	private String name;
	
	public SalesPerson(int sales, String name) {
		super();
		this.sales = sales;
		this.name = name;
		totSales += sales;
	}
	
	public void display(){
		System.out.println(name+" " +sales );
	}
}
