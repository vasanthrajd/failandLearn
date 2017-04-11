package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ClientA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> lst=new Vector<Emp>();
		lst.add(new Emp(1001,"hai",9000));
		lst.add(new Emp(1005,"jai",900));
		lst.add(new Emp(1002,"Beai",9234));
		lst.add(new Emp(1003,"kai",800));
		lst.add(new Emp(1004,"nai",9000));
	/// Collections.sort(lst); Error
		Collections.sort(lst);
		
		
	for (Emp emp:lst){
		System.out.println(emp);
	}
	
	System.out.println("Sort based on Salary");
	Collections.sort(lst, new SalComparator());
	for (Emp emp:lst){
		System.out.println(emp);
	}
	Collections.sort(lst, new NameComparator());
	for (Emp emp:lst){
		System.out.println(emp);
	}
	

}
}
