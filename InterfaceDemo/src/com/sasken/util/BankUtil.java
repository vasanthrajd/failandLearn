package com.sasken.util;

import com.sasken.service.Agent;
import com.sasken.service.Atm;
import com.sasken.service.Bank;

public class BankUtil {

	private static Bank bank=new Bank();
	
	public static Atm getAtm(){
		return bank;
	}
	public static Agent getAgent(){
		return bank;
	}

}
