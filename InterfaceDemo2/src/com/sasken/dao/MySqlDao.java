package com.sasken.dao;

public class MySqlDao implements DaoI {

	@Override
	public void getProducts() {
		// TODO Auto-generated method stub
		System.out.println("My Sql get products");
	}

	@Override
	public void getProducts(double price) {
		// TODO Auto-generated method stub
		System.out.println("My Sql get products by price");
	}

}
