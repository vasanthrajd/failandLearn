package com.training.ano.tab.perclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Elect")
public class ElectronicGadgets extends Item {

	private String brand;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public ElectronicGadgets() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicGadgets(int itemCode, String itemName, String brand,
			String model) {
		super(itemCode, itemName);
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "ElectronicGadgets [brand=" + brand + ", model=" + model
				+ ", getItemCode()=" + getItemCode() + ", getItemName()="
				+ getItemName() + "]";
	}
	
	
}
