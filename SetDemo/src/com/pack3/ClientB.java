package com.pack3;

import java.util.Set;
import java.util.TreeSet;

public class ClientB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Emp> set=new TreeSet<Emp>(new SalComparator());
		
		Emp e1=new Emp(1001,"hai",9000);
		Emp e2=new Emp(1005,"jai",900);
		Emp e3=new Emp(1002,"Beai",9000);
		Emp e4=new Emp(1003,"kai",800);
		Emp e5=new Emp(1004,"nai",9000);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		for(Emp emp: set )
		{
			System.out.println(emp);
		}
		
		}
	}

