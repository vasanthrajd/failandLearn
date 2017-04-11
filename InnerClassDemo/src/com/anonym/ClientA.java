package com.anonym;


/* It will create/writes the three classes in the package
 * clientA.class
 * clientA$1.class		eagle is the instance for this class
 * clientA$2.class		bat
 */

public class ClientA {

	/**
	 * @param args
	 */
	//Flyable f1=new Flyable();		// Wrong
	static Flyable eagle=new Flyable(){ 	// doing so we no need oto implement the flyable interface

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Eagle Fly");
		}
		
	};
	static Flyable bat=new Flyable() {		// second implementation of the interface
		
		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Bat fly");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
