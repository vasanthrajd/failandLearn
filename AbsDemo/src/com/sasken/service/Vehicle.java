package com.sasken.service;

public abstract class Vehicle {
	
	public int vehId;
	public String vehName;
	public double price;
	
	public void checkFuel(){
	System.out.println("check fuel..");	
	}
	
	public void display(){
		System.out.println(vehId+" " + vehName + " " + price);
		
	}
	
	
	public abstract void drive();
	
}
