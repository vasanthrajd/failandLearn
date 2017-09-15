package com.training;
import java.util.*;
public class ListfTrainer {

	
	private int trainerCode;
	private List<String> participants;
	private String  subject;
	
	public int getTrainerCode() {
		return trainerCode;
	}
	public void setTrainerCode(int trainerCode) {
		this.trainerCode = trainerCode;
	}
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
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
	public ListfTrainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListfTrainer(int trainerCode, List<String> participants, String subject) {
		super();
		this.trainerCode = trainerCode;
		this.participants = participants;
		this.subject = subject;
	}
	
	
	
}
