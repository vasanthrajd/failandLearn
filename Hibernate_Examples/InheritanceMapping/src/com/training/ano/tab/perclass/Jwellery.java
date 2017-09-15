package com.training.ano.tab.perclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue(value="JWL")
public class Jwellery extends Item {

	
	private double unitOfMeasure;
	private String purity;
	
	public double getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(double unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getPurity() {
		return purity;
	}
	public void setPurity(String purity) {
		this.purity = purity;
	}
	public Jwellery(int itemCode, String itemName, double unitOfMeasure,
			String purity) {
		super(itemCode, itemName);
		this.unitOfMeasure = unitOfMeasure;
		this.purity = purity;
	}
	public Jwellery() {
		super();
		
	}
	@Override
	public String toString() {
		return "Jwellery [unitOfMeasure=" + unitOfMeasure + ", purity="
				+ purity + ", getItemCode()=" + getItemCode()
				+ ", getItemName()=" + getItemName() + "]";
	}
	
	
	
}
