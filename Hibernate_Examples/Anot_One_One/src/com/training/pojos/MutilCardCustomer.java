package com.training.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.training.CreditCard;
import java.util.*;
@Entity
@Table(name="MultiCardCustomer")

public class MutilCardCustomer {
	
		private int customerId;
		private String customerName;
		private Set<CreditCard> cards;
		
		@Id
		@GeneratedValue
		@Column(name="cust_id")

		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		 
		
		@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	    @JoinColumn(name="customerId")
	    
		public Set<CreditCard> getCards() {
			return cards;
		}
		public void setCards(Set<CreditCard> cards) {
			this.cards = cards;
		}
		public MutilCardCustomer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public MutilCardCustomer(String customerName, Set<CreditCard> cards) {
			super();
			this.customerName = customerName;
			this.cards = cards;
		}
		
		
}
