package com.training.ano.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BDA_Address")
public class BdAddress {
	@Id
	@Column(name="addrid")
	private  int addressId;
	
	@Column(name="place",length=10)
	private String place;
	
	@OneToOne(targetEntity=BdStudent.class,cascade=CascadeType.ALL)
	@JoinColumn(name="stu_id",referencedColumnName="sid")
	private  BdStudent  parent;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public BdStudent getParent() {
		return parent;
	}
	public void setParent(BdStudent parent) {
		this.parent = parent;
	}
	
	
	
	

}
