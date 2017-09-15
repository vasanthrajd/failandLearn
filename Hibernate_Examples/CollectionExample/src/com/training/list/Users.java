package com.training.list;

import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Id;
import java.util.*;

@Entity
@Table(name="Ano_Users")
public class Users {

	    @Id
	    @GeneratedValue
	    private Long id;
	    @ElementCollection
	    @CollectionTable(name = "Ano_Certification",
	    		joinColumns = {@JoinColumn(name="user_id")})
	    private List<Certification> certifications = new ArrayList<Certification>();

	   
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public List<Certification> getCertifications() {
	        return certifications;
	    }

	    public void setCertifications(List<Certification> certifications) {
	        this.certifications = certifications;
	    }
}
