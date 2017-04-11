package com.pack2;

import java.util.HashSet;
import java.util.Set;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(1009,"ford", 89000);
		Car c2=new Car(1002,"Lamborghini", 9000);
		Car c3=new Car(1009,"camro", 8000);
		Car c4=new Car(1009,"ford", 89000);
		Car c5=new Car(1010,"ford", 9000);
		Car c6=new Car(1011,"ford1", 89000);
		
		Set<Car> set=new HashSet<Car>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);	// duplicate value for car id conents are added it will not be ignored to do so you need to mention the methods to do so.
		
		set.add(c1);	// ignores duplicate values of object reference
		set.add(c5);	
		set.add(c6);
		
		for(Car c: set){
			System.out.println(c);
		}
		
	}

}
