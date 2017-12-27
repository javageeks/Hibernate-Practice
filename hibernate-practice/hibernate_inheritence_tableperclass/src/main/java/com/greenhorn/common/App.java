package com.greenhorn.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.greenhorn.model.Student;
import com.greenhorn.model.StudentFullTime;
import com.greenhorn.model.StudentPartTime;
import com.greenhorn.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Maven + Hibernate + MySQL");
    	 
    	
    	 StudentFullTime fulltime = new StudentFullTime();
    	 StudentPartTime partime =new StudentPartTime();
    	 
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =  sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        partime.setFirstName("ADBC");
        partime.setLastName("XYZ");
        partime.setTitle("Mr");
        
        partime.setCourse("Spring");
        partime.setHoursPerWeek(4);
        
        fulltime.setFirstName("SUGAT");
        fulltime.setLastName("Misra");
        fulltime.setTitle("Mr");
        fulltime.setCourse("WEBSERVICES");
        fulltime.setDuration(60);
        
       
        session.save(partime);
        session.save(fulltime);
        transaction.commit();
        session.close();
         
    }
}
