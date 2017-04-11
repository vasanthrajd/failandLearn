package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("ram1");
		lst.add("ram");
		lst.add("ram2");
		lst.add("ram3");
		lst.add("hai");
		
		Collections.sort(lst);
		
		//advanced for loop
		for(String str: lst){		// No need to create the object for accessing the elements, instead we can create the Primitive data type variable directly avoiding typecasting.
			System.out.println(str);
		}
		
		System.out.println("____________________________");
		//using the classical for loop
		for(int i=0;i<lst.size();++i){
			System.out.println(lst.get(i));
		}
		
		System.out.println("____________________________");
		
		// iterator
		Iterator<String> it=lst.iterator();
		while(it.hasNext()){	//to check is there any next element which returns only T 0r F, 
			System.out.println(it.next());
		}
		
		
		
	}

}
