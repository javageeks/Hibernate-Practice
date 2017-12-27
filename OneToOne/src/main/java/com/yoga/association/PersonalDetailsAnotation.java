/**
 * 
 */
package com.yoga.association;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author Hussain
 *
 */
@Entity
@Table(name = "ANO_EMP_PERSONAL", catalog = "hibernate_practice")
public class PersonalDetailsAnotation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4103484525603304051L;
	
	private int empNo;
	private long adharNumber;
	private String panNumber;
	private String passPortNumber;
	private EmployeeAnotation employee;
	
	public PersonalDetailsAnotation() {
		// TODO Auto-generated constructor stub
	}
	@GenericGenerator(name = "generator", strategy = "foreign",
			parameters = @Parameter(name = "property", value = "employee"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "EMP_NO")
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	@Column(name="EMP_ADHAR")
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	@Column(name="EMP_PAN")
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Column(name="EMP_PASSPORT")
	public String getPassPortNumber() {
		return passPortNumber;
	}
	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}

	@OneToOne
	@PrimaryKeyJoinColumn()
	public EmployeeAnotation getEmployee() {
		return employee;
	}


	public void setEmployee(EmployeeAnotation employee) {
		this.employee = employee;
	}




}
