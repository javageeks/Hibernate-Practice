/**
 * 
 */
package com.yoga.association;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author Hussain
 *
 */
@Entity
@Table(name = "ANO_EMP", catalog="hibernate_practice")
public class EmployeeAnotation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empNo;
	private String empName;
	private PersonalDetailsAnotation empPersonalDetails;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMP_NO")
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@Column(name = "EMP_NAME", nullable = false, length = 100)
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	//@OneToOne(mappedBy  = "employee", cascade = CascadeType.ALL)
	@OneToOne( cascade = CascadeType.ALL)
	public PersonalDetailsAnotation getEmpPersonalDetails() {
		return empPersonalDetails;
	}
	public void setEmpPersonalDetails(PersonalDetailsAnotation empPersonalDetails) {
		this.empPersonalDetails = empPersonalDetails;
	}
	@Override
	public String toString() {
		return "EmployeeAnotation [empNo=" + empNo + ", empName=" + empName + ", empPersonalDetails="
				+ empPersonalDetails + "]";
	}
	
}
