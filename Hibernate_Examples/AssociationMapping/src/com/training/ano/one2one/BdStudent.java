package com.training.ano.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BDA_students")
public class BdStudent {
	@Id
	@Column(name="sid")
	private int studentId;
	
	@Column(name="sname", length=10)
	private String studentName;
	
	@Column(name="grp",length=10)
	private String grp;
	@OneToOne(targetEntity=BdAddress.class)
	@JoinColumn(name="add_id",referencedColumnName="addrid")
	private BdAddress addr;
	
	public BdAddress getAddr() {
		return addr;
	}
	public void setAddr(BdAddress addr) {
		this.addr = addr;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	

}
