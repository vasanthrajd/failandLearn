package com.sasken.client;

import com.sasken.service.Atm;
import com.sasken.util.BankUtil;

public class AtmClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BankUtil obj=new BankUtil();
		Atm atm=BankUtil.getAtm();
		atm.withDraw();
		atm.getBalance();
		
		

	}

}
