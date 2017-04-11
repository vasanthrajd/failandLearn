package com.pack2;

public class Car {
	private int carId;
	private String carName;
	private double price;
	public Car(int carId, String carName, double price) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
	}
	public int getCarId() {
		return carId;
	}
	public String getCarName() {
		return carName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carId +" " + carName+" " +price;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car car=(Car)obj;
		if(this.carId==car.carId){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return carId*7;
	}
	
	
}
