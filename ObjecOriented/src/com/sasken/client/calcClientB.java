package com.sasken.client;

import java.util.Scanner;

import com.sasken.service.Calculator;

public class calcClientB {

	public static void main(String[] args) {
		String opt="";
		Scanner scan=new Scanner(System.in);
		do
		{
			Calculator calc=new Calculator();
			System.out.println("Enter the Value: ");
			calc.val1=scan.nextInt();
			System.out.println(calc.dofact());
			System.out.println("Press Y to continue: ");
			opt=scan.next();
			
		}while(opt.equalsIgnoreCase("y"));
	}
}
