package com.training;
import java.util.*;

public class Book {
	private Long id;
	private String isbn;
	private String name;
	private Date publishDate;
	private Integer price;
	private List chapters;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public List getChapters() {
		return chapters;
	}
	public void setChapters(List chapters) {
		this.chapters = chapters;
	}
	public Book(Long id, String isbn, String name, 
			Date publishDate, Integer price, List chapters) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;

		this.publishDate = publishDate;
		this.price = price;
		this.chapters = chapters;
	}
	public Book() {
		super();
	}
	
	
}
