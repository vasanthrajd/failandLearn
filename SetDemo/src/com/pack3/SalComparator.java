package com.pack3;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		
		// TODO Auto-generated method stub
		if(e1.getEmpSal()> e2.getEmpSal()){
			return 1;
		}else if (e1.getEmpSal()< e2.getEmpSal()){
			return -1;
		}else {
			if(e1.getEmpId()> e2.getEmpId()){
					return 1;
			}
		else if (e1.getEmpId()< e2.getEmpId()){
			return -1;
		}else {
			return 0;
		}
			
	}
	}	
}