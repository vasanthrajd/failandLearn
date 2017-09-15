package com.training.pojos;
import java.util.*;
public class Training {

	private int trng_code;
	private String trainer;
	private String  location;
	private List participant;
	public int getTrng_code() {
		return trng_code;
	}
	public void setTrng_code(int trng_code) {
		this.trng_code = trng_code;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List getParticipant() {
		return participant;
	}
	public void setParticipant(List participant) {
		this.participant = participant;
	}
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
