package com.training;
import java.util.*;
public class Trainer {

	
	private int trainerCode;
	private Set<String> participants;
	private String  subject;
	
	public int getTrainerCode() {
		return trainerCode;
	}
	public void setTrainerCode(int trainerCode) {
		this.trainerCode = trainerCode;
	}
	public Set<String> getParticipants() {
		return participants;
	}
	public void setParticipants(Set<String> participants) {
		this.participants = participants;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Trainer [trainerCode=" + trainerCode + ", participants="
				+ participants + ", subject=" + subject + "]";
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int trainerCode, Set<String> participants, String subject) {
		super();
		this.trainerCode = trainerCode;
		this.participants = participants;
		this.subject = subject;
	}
	
	
	
}
