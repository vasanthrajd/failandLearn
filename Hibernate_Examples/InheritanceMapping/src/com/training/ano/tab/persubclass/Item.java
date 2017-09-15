package com.training.ano.tab.persubclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Ano_Products2")
@Inheritance(strategy=InheritanceType.JOINED)
 
public class Item {

	@Id
	private int itemCode;
	private String itemName;
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Item(int itemCode, String itemName) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
	}
	public Item() {
		super();
		
	}
	
}
