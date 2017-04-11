package com.sasken.client;

import com.sasken.service.Calculator;

public class CalcClient {


	public static void main(String[] args) {


		Calculator obj=new Calculator();
		obj.val1=153;
		
		obj.val2=5;
		
		System.out.print("Addition : " + obj.doAdd());
		System.out.print("Sub : " + obj.doSub());

		System.out.print(obj.checkNumber());
		System.out.print(obj.dofact());
		System.out.print(obj.checkArms());
	}
}

