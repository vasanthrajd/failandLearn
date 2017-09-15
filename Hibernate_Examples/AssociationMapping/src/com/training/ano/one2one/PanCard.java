package com.training.ano.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="A_PanCard")
public class PanCard {

	@Id
	private long panCardNumber;
	
	public PanCard() {
		super();
		}
	public long getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(long panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@OneToOne(targetEntity=Person.class,cascade=CascadeType.ALL)
	@JoinColumn(name="pers_ref",referencedColumnName="personUId")
	private Person person;
	
}
