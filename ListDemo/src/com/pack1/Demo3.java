package com.pack1;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

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
		lst.toString();
		System.out.println(lst);
		lst.add(1,"anand");
		System.out.println(lst);
		lst.remove(2);
		System.out.println(lst);
		System.out.println("Size"+ lst.size());
		System.out.println("second element "+ lst.get(2));
		
		List<String> lst2= new ArrayList<String>();
		lst2.addAll(lst);
		
		System.out.println(lst2);
				
		
	}	

}
