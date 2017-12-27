package com.yoga.association;

import java.io.Serializable;

public class EmpPersonalDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7824661672003336587L;
	public EmpPersonalDetails() {
		
	}
	private int empNo;
	private String firstName;
	private String lastName;
	private Employee employee;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	@Override
	public String toString() {
		return "EmpPersonalDetails [empNo=" + empNo + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
