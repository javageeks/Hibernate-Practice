package com.greenhorn.model;

import java.io.Serializable;

public class StudentPartTime extends Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2212825445626810226L;
	private int hoursPerWeek;
	private String course;
	
	public StudentPartTime() {
		// TODO Auto-generated constructor stub
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudetnPartTime [hoursPerWeek=" + hoursPerWeek + ", course=" + course + "]";
	}
}
