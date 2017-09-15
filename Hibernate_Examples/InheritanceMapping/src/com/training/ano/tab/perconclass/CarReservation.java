package com.training.ano.tab.perconclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="Ano_CarReservation")
public class CarReservation extends Reservation {

	private String vechileType;
	private String vechileModel;
	public String getVechileType() {
		return vechileType;
	}
	public void setVechileType(String vechileType) {
		this.vechileType = vechileType;
	}
	public String getVechileModel() {
		return vechileModel;
	}
	public void setVechileModel(String vechileModel) {
		this.vechileModel = vechileModel;
	}
	public CarReservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
