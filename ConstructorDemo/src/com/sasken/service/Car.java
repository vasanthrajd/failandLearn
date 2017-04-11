package com.sasken.service;

public class Car {
	private int carId;
	private String carName;
	private double carPrice;
	// Constructor Chaining 
	public Car(){		// no argument constructor it is not a default constructor
   		//super();			// this or super is missing,compiler will write here super();
		
		System.out.println("No argument constructor called");
	}
	
	public Car(int carId ){
		this();
		this.carId=carId;
		System.out.println("One argument constructor called ");
	}
	public Car(int carId, String carName){
		this(carId);
		this.carName=carName;
		System.out.println("Two argument constructor called ");
	}
	
	public Car(int carId, String carName,double carPrice){
		this(carId,carName);
		this.carPrice=carPrice;
		System.out.println("Three argument constructor called ");
		
	}
	public int getCarId() {
		return carId;
	}
	public String getCarName() {
		return carName;
	}
	public double getCarPrice() {
		return carPrice;
	}
	
	
}
