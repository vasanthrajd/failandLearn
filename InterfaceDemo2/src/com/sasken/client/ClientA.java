package com.sasken.client;

import com.sasken.dao.DaoI;
import com.sasken.util.daoUtil;

public class ClientA {

	public static void main(String[] args)
	{
		DaoI dao =daoUtil.getInstance();
		dao.getProducts();
		dao.getProducts(50);
	}
	
}
