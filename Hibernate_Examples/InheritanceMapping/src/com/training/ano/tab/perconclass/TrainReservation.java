package com.training.ano.tab.perconclass;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Ano_TrainReservation")
public class TrainReservation extends Reservation {

private String boarding;
private String destination;
public String getBoarding() {
	return boarding;
}
public void setBoarding(String boarding) {
	this.boarding = boarding;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public TrainReservation() {
	super();
	
}

}
