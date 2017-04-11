package com.sasken.client;

import com.sasken.service.SalesPerson;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson p1=new SalesPerson(5000,"ram");
		SalesPerson p2=new SalesPerson(8000,"shyam");
		SalesPerson p3=new SalesPerson(9000,"sri");
		p1.display();
		p2.display();
		p3.display();
		System.out.println("Total sales " + SalesPerson.totSales);
	}

}
