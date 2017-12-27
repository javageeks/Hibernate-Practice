package com.greenhorn.model;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String title; //Mr or Miss
	private String firstName;
	private String lastName;
	private Address presentAdd;
	private Address permAdd;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Address getPresentAdd() {
		return presentAdd;
	}
	public void setPresentAdd(Address presentAdd) {
		this.presentAdd = presentAdd;
	}
	public Address getPermAdd() {
		return permAdd;
	}
	public void setPermAdd(Address permAdd) {
		this.permAdd = permAdd;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", presentAdd=" + presentAdd + ", permAdd=" + permAdd + "]";
	}
	
	

}
