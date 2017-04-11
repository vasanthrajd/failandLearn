package com.pack3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ClientC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp(1001,"hai",9000);
		Emp e2=new Emp(1005,"jai",900);
		Emp e3=new Emp(1002,"Beai",9000);
		Emp e4=new Emp(1003,"kai",800);
		Emp e5=new Emp(1004,"nai",9000);
		List<Emp> lst=new ArrayList<Emp>();
		
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		
		Set<Emp> set=new TreeSet<Emp>(new SalComparator());
		set.addAll(lst);
		for(Emp emp :set){
			System.out.println(emp);
		}
		
		
		
		
	}

}
