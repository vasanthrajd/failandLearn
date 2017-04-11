package com.sasken.dao;

public interface DaoI {
	void getProducts();		//By default it will come with public abstract impliicitly
	void getProducts(double price);
}
