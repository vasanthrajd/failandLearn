package com.sasken.service;

public class Emp {

	private String companyname;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	
	
	//NOTE for exception in setters
	public void setAge(int age) throws Exception{
		if(age>=18 && age<=50)
			this.age = (byte)age;		else
			throw new Exception("Age Must be abve 18");
	}
	private String empName;
	private byte age;
	

}
