package com.greenhorn.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.greenhorn.model.Student;
import com.greenhorn.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student student = new Student();  //                                Transient  
    	SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	
    	
    	student.setTitle("Mr");               // Student ... persistent id / primary key
    	student.setFirstName("ABC");
    	student.setLastName("Z");
    	student.setCourse("Spring");
    	session.save(student);
    	transaction.commit();
    	
    	session.close();
    	
    	student = (Student)session.get(Student.class, 1); // student detached .. ... 
    	
    	
    }
}
