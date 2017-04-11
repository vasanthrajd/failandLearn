package com.sasken.clientA;

import com.sasken.serivce.*;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutiTable table=new MutiTable();
		table.displayTable(5);
		table.displayTable(9, 5);
		table.displayTable(9, 2, 7);
		
	}

}
