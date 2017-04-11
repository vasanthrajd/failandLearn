package com.sasken.clientA;

import com.sasken.serivce.Area;

public class ClientB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area=new Area();
		System.out.println(area.calcArea(5));
		System.out.println(area.calcArea(5.3));
		System.out.println(area.calcArea(5));
	}

}
