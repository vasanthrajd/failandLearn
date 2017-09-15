package com.training.pojos;

public class Participant {

	private int participant_id;
    private String participant_Name;
    private int part_index;
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getParticipant_id() {
		return participant_id;
	}
	public void setParticipant_id(int participant_id) {
		this.participant_id = participant_id;
	}
	public String getParticipant_Name() {
		return participant_Name;
	}
	public void setParticipant_Name(String participant_Name) {
		this.participant_Name = participant_Name;
	}
	public int getPart_index() {
		return part_index;
	}
	public void setPart_index(int part_index) {
		this.part_index = part_index;
	}
	public Participant(int participant_id, String participant_Name) {
		super();
		this.participant_id = participant_id;
		this.participant_Name = participant_Name;
	}
    
    
}
