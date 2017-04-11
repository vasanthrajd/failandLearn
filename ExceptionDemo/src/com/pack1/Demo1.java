package com.pack1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Line 1..");
		System.out.println("Line 2..");
		try {
			readData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
			
		}			// Here JVM implicitly forces to throws exception which in turn it will make the
							// pgm to stop abnormally,... It is handled in run time. not in compile time
		
		
		System.out.println("Line 3..");
		System.out.println("Line 4..");
		
	}
public static void readData() throws FileNotFoundException{
	FileReader fr=new FileReader("abc.txt");
}
}
