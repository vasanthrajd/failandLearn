package com.sasken.service;

public class Calculator {

	public int val1;
	public int val2;
	
	public int doAdd()
	{
		return val1+val2;
	}
	
	public int doSub()
	{
		return val1-val2;
	}
	
	public int doMul()
	{
		return val1*val2;
	}
	
	public String checkNumber()
	{
		if(val1>0)
		{
			return "Positive";
		}
		else if(val1<0)
			return "Negative";
		else
			return "Zero";
	}
	
	public long  dofact() {
		long fact=1;
		for (int i=0;i<val1;i++)
		{
			fact+=fact*i;
		}
		return fact;
		
	}
	
	public String checkArms()
	{
		int val1=1;
		int temp=this.val1;
		int quot=0;
		int rem=0,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum+=rem*rem*rem;
			temp=temp/10;
		}
		if (this.val1==sum)
		{
			return "Yes it is Armstrong";
		}
		else
			return "Not Armstrong";

	}

}
