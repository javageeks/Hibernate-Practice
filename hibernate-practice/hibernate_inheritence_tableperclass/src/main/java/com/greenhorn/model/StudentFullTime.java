package com.greenhorn.model;

import java.io.Serializable;

public class StudentFullTime extends Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3673762217109128018L;
	private int duration;
	private String Course;
	public StudentFullTime() {
		// TODO Auto-generated constructor stub
	}
	public int getDuration() {
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
	@Override
	public String toString() {
		return "StudentFullTime [duration=" + duration + ", Course=" + Course + "]";
	}
	
}
