package com.training;

public class InsuranceAgent {

	private int cust_id;
	private String cust_name;
	private PolicyCodes  pol_code;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public PolicyCodes getPol_code() {
		return pol_code;
	}
	public void setPol_code(PolicyCodes pol_code) {
		this.pol_code = pol_code;
	}
	public InsuranceAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
