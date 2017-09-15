package com.training.ano.one2one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ano_Person1")
public class Person {

	@Id
	private int personUId;
	private String personName;
	
	
	public int getPersonUId() {
		return personUId;
	}
	public void setPersonUId(int personUId) {
		this.personUId = personUId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Person(int personUId, String personName) {
		super();
		this.personUId = personUId;
		this.personName = personName;
	}
	
	public Person() {
		super();
	
	}

	
	
	
}
