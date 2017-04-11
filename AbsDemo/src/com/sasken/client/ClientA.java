package com.sasken.client;

import com.sasken.service.Car;
import com.sasken.service.Vehicle;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle veh=new Car();
		veh.vehId=1001;
		veh.vehName="I10";
		veh.price=70000;
		
		veh.drive();
		veh.display();
		veh.checkFuel();
				
	}

}
