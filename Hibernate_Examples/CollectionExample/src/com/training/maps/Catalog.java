package com.training.maps;


import java.util.*;
import java.util.Map;

import javax.persistence.CollectionTable;

import javax.persistence.ElementCollection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Ano_Catalog1")
public class Catalog {
	
	
	@Id
	private int catlogNumber;
	private String prodName;
	
	@ElementCollection
    @CollectionTable(name = "Ano_Image_Cat",
    		joinColumns = {
    		   @JoinColumn(name="imageId") 		  
    		   })
    
    
	private Map<String,String> images=new HashMap<String,String>();	
	public Catalog() {
		super();
		System.out.println("Calling Constructor");
		}

	

	public Map<String, String> getImages() {
		
		System.out.println("Calling Get Images");
		return images;
	}



	public void setImages(Map<String, String> images) {
		
		System.out.println("Calling Set Images");
		this.images = images;
	}



	public int getCatlogNumber() {
		return catlogNumber;
	}

	public void setCatlogNumber(int catlogNumber) {
		this.catlogNumber = catlogNumber;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	

	
	
	

	
}
