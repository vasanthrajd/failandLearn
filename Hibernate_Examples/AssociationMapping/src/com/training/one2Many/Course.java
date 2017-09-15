package com.training.one2Many;
import java.util.*;

public class Course {

	
	private int course_id;
	private String course_name;
	
	private Set<Student> studentList;

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

	public Set<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(Set<Student> studentList) {
		this.studentList = studentList;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int course_id, String course_name, Set<Student> studentList) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.studentList = studentList;
	}
	
	
}
