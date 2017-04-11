package com.pack2;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e0, Emp e1) {
		// TODO Auto-generated method stub
		String s1=e0.getEmpName();
		String s2=e1.getEmpName();
		return s1.compareTo(s2);
		
	}

}
