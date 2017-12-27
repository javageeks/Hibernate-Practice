package com.greenhorn.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.greenhorn.model.Student;
import com.greenhorn.model.StudentPersonalDetails;
import com.greenhorn.persistence.HibernateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentPersonalDetails spd = new StudentPersonalDetails();
		Student student = new Student();
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	spd.setFirstName("ABC");
    	spd.setLastName("ZYX");
    	spd.setGender("M");
    	
    	student.setStudentDetails(spd);
    	//spd.setStudent(student);
    	session.save(spd);
    	session.save(student);
    	
    	transaction.commit();
    	session.close();
	}

}
