package com.training.s1;

import java.util.Map;
import java.util.logging.Logger;

public class Invoicemap {
private Customer cust;
Logger log=Logger.getLogger(this.getClass().getName());
private Map<Integer, Item> mapId;
public Customer getCust() {
	log.info("in the Get Cust method");
	return cust;
}

public Invoicemap() {
	super();
	log.info("default in constructor");
}

public Invoicemap(Customer cust) {
	super();
	log.info("Single arg in constructor");
	this.cust = cust;
}
public void setCust(Customer cust) {
	log.info("in the Set Cust method");
	this.cust = cust;
}
public Map<Integer, Item> getMapId() {
	log.info("in the Get MapId method");
	return mapId;
}
public void setMapId(Map<Integer, Item> mapId) {
	log.info("in the Get Set MapId method");
	this.mapId = mapId;
}
@Override
public String toString() {
	return "Invoicemap [cust=" + cust + ", mapId=" + mapId + "]";
}

	
}
