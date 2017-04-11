package com.sasken.clientA;

import com.sasken.service.NokiaLumia;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NokiaLumia mobile =new NokiaLumia();
		mobile.doConverse();
		mobile.sendSms();
		mobile.captureImage();
		mobile.playVideo();
	}

}
