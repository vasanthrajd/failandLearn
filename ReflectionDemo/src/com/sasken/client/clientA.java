package com.sasken.client;

import java.util.ResourceBundle;

import com.sasken.service.BikeService;
import com.sasken.service.CarService;

public class clientA {

	/**
	 * @param args
	 */
	private static ResourceBundle rb= null;
	static{
		rb=ResourceBundle.getBundle("sasken");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cls= rb.getString("carcls");
		try {
			Class clazz= Class.forName(cls);		// 
			Object obj=clazz.newInstance();
			if(obj instanceof CarService){
				CarService ser=(CarService)obj;
				ser.displayCarDetails();	
			}else if(obj instanceof BikeService){
				BikeService ser=(BikeService) obj;
				ser.displayBikeDetails();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
