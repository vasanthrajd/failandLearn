package com.training.one2Many;
import java.util.*;
public class Student {

	private int student_id;
	private String student_name;
	
	private Set<Course> courses;

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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String student_name, Set<Course> courses) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.courses = courses;
	}

	public Student(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	
	
}
