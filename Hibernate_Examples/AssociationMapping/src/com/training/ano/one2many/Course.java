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
@Table(name="Ano_Course")

public class Course {

	@Id
	private int course_id;
	private String course_name;

	
	@SuppressWarnings("rawtypes")
	@OneToMany(fetch=FetchType.LAZY, 
			    targetEntity=Student.class, 
			      cascade=CascadeType.ALL)
			      
    @JoinColumn(name = "crs_id", referencedColumnName="course_id")
    
	private Set studentList;
	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Set getStudentList() {
		return studentList;
	}

	public void setStudentList(Set studentList) {
		this.studentList = studentList;
	}

	public Course() {
		super();
		
	}

	public Course(int course_id, String course_name, Set<Student> studentList) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.studentList = studentList;
	}
	
	
}
