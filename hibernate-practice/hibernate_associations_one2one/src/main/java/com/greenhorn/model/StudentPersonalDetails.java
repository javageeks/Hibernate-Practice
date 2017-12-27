package com.greenhorn.model;

import java.io.Serializable;

public class StudentPersonalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sno;
	private String firstName;
	private String lastName;
	private String gender;
	//private Student student;
	
	public StudentPersonalDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

/*	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}*/
}
