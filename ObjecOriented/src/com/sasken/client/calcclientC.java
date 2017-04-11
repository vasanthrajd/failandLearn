package com.sasken.client;

import java.util.Scanner;

import com.sasken.service.Calculator;

public class calcclientC {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose the Menu ");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multi");
		int menu=scan.nextInt();
		Calculator calc=new Calculator();
				
		System.out.println("Enter the First Value");
		calc.val1=scan.nextInt();
		System.out.println("Enter the Second Value");
		calc.val2=scan.nextInt();
		
		switch(menu)
		{
		case 1:
			System.out.println(calc.doAdd());
			break;
		case 2:
			System.out.println(calc.doSub());
			break;
		case 3:
			System.out.println(calc.doMul());
		
			break;
			
		default:
			System.out.println("Enter 1 2 31:");
				
				
		}
		}
		
	
}
