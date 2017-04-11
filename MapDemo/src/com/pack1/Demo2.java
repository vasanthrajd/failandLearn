package com.pack1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1001, "ram");
		map.put(1002, "dev");
		map.put(1003, "sam");
		map.put(1004, "tam");
		
		Set<Integer> keys= map.keySet();
		for(int key : keys){
			System.out.println(map.get(key));
		}
		
		System.out.println("****************");
		
		// values 
		Collection<String> cal=map.values();
		for (String str: cal){
			System.out.println(str);
		}
		
		
		
		
	}

}
