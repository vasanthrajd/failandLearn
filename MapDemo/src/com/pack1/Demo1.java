package com.pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1001, "ram");
		map.put(1002, "dev");
		map.put(1003, "sam");
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Emp id");
		int eid=scan.nextInt();
		String str=map.get(eid);
		if(str!=null){
			System.out.println(str);
		}else{
			System.out.println("Not Found");
		}
	}

}
