package com.training.maps;

import javax.persistence.Embeddable;

@Embeddable
public class Image {

	private String imgCode;
	private String imgFile;
	
	public String getImgCode() {
		return imgCode;
	}
	public void setImgCode(String imgCode) {
		this.imgCode = imgCode;
	}
	public String getImgFile() {
		return imgFile;
	}
	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}
	public Image() {
		super();
		
	}
	public Image(String imgCode, String imgFile) {
		super();
		this.imgCode = imgCode;
		this.imgFile = imgFile;
	}
	
	
	
}
