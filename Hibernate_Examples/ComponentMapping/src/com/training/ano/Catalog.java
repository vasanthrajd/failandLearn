package com.training.ano;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ano_Catalog")
public class Catalog {
	
	
	@Id
	private int catlogNumber;
	private String prodName;
	
	@Embedded
	private Image image;

	
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(
				 name="imgCode",column=@Column(name="thumb_imgCode")),
		@AttributeOverride(
				name="imgFile",column=@Column(name="thumb_imgFile"))
	})
	private Image thumbNails;
	
	public Catalog() {
		super();
		}

	public Catalog(int catlogNumber, String prodName, Image image) {
		super();
		this.catlogNumber = catlogNumber;
		this.prodName = prodName;
		this.image = image;
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

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Catalog(int catlogNumber, String prodName, Image image,
			Image thumbNails) {
		super();
		this.catlogNumber = catlogNumber;
		this.prodName = prodName;
		this.image = image;
		this.thumbNails = thumbNails;
	}
	
	

	
}
