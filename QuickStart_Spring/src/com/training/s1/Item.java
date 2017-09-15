package com.training.s1;

import java.util.logging.Logger;

public class Item {
private int itemNumber;
private String itemName;
private double ratePerUnit;
Logger li=Logger.getLogger(this.getClass().getName());

public int getItemNumber() {
	return itemNumber;
}
public void setItemNumber(int itemNumber) {
	this.itemNumber = itemNumber;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
public Item(int itemNumber, String itemName, double ratePerUnit) {
	super();
	this.itemNumber = itemNumber;
	this.itemName = itemName;
	this.ratePerUnit = ratePerUnit;
}

public void init(){
	li.info("INIT Method Intialized");
}
public void destroy(){
	li.info("Destroy Method Finished");
}

}

