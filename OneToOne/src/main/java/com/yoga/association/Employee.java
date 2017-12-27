package com.yoga.association;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Employee() {
		
	}
	private int empNo;
	private int age;
	
	private EmpPersonalDetails empPersonalDetails;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
	public EmpPersonalDetails getEmpPersonalDetails() {
		return empPersonalDetails;
	}
	public void setEmpPersonalDetails(EmpPersonalDetails empPersonalDetails) {
		this.empPersonalDetails = empPersonalDetails;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", age=" + age + ", empPersonalDetails=" + empPersonalDetails + "]";
	}
}
