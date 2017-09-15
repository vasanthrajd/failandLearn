package com.training.list;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Embeddable
public class Certification {
	
	   private String verNumber;
	   @Temporal(TemporalType.DATE)
	    @Column(name = "issue_date")
	    private Date issueDate;
	
		@Column(name = "name")
	    private String name;
	     public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

		public Certification() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getVerNumber() {
			return verNumber;
		}

		public void setVerNumber(String verNumber) {
			this.verNumber = verNumber;
		}

		public Date getIssueDate() {
			return issueDate;
		}

		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}
	    
	    
	
}
