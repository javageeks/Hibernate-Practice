package com.greenhorn.model;

import java.io.Serializable;

public class StudentFullTime extends Student implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6470899325227625138L;
	@Override
	public String toString() {
		return "StudentFullTime [duration=" + duration + ", Course=" + Course + "]";
	}



	private int duration;
	private String Course;
	
	int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	
	
	public StudentFullTime() {
		// TODO Auto-generated constructor stub
	}
}
