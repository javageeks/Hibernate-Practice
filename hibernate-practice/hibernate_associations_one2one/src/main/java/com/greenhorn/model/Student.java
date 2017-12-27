package com.greenhorn.model;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int sno;
	private StudentPersonalDetails studentDetails;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public StudentPersonalDetails getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(StudentPersonalDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
}
