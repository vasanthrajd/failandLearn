package com.training.ano.one2many;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Ano_Student")
public class BDStudent {

	@Id
	private int student_id;
	private String student_name;
	

	@OneToMany(fetch=FetchType.LAZY, targetEntity=BDCourse.class, cascade=CascadeType.ALL)
    @JoinColumn(name = "stud_id_ref", referencedColumnName="course_id")
	private Set courseList;

	public Set getCourseList() {
		return courseList;
	}

	public void setCourseList(Set courseList) {
		this.courseList = courseList;
	}

	public BDStudent(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	

	public BDStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
