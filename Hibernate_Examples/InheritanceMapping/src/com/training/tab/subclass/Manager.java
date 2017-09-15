package com.training.tab.subclass;

public class Manager extends Person {

	private int managerId;
	
	private String location;
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
