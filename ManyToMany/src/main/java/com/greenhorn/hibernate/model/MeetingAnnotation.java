package com.greenhorn.hibernate.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MEETING")
public class MeetingAnnotation {

	@Id
	@Column(name="MEETING_ID")
	@GeneratedValue
	private Long meetingId;

	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="MEETING_DATE")
	private Date meetingDate;
	
	@ManyToMany(mappedBy="meetings")
	private Set<EmployeeAnnotation> employees = new HashSet<EmployeeAnnotation>();
	
	public MeetingAnnotation(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}
	
	public Set<EmployeeAnnotation> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeAnnotation> employees) {
		this.employees = employees;
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

}
