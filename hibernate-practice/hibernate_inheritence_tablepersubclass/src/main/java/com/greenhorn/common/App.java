package com.greenhorn.common;

import org.hibernate.Session;

import com.greenhorn.model.Student;
import com.greenhorn.model.StudentFullTime;
import com.greenhorn.model.StudentPartTime;
import com.greenhorn.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Maven + Hibernate + MySQL");
    	 
         Student student = new Student();  // student instantiation state .....
         //Student student2 = new Student(); // student instantiation state .....
         StudentFullTime studentfull = new StudentFullTime();
         StudentPartTime studentPartTime = new StudentPartTime();
         
         Session session = HibernateUtil.getSessionFactory().openSession();
         
         session.beginTransaction();
         studentfull.setFirstName("SANDEEP"); // persistent identity -- primary key and java identity 
         studentfull.setLastName("R");
         studentfull.setTitle("Mr");
         studentfull.setDuration(45);
         studentfull.setCourse("Hibernate");
         
         studentPartTime.setFirstName("SHAIK"); // persistent identity -- primary key and java identity 
         studentPartTime.setLastName("Hussain");
         studentPartTime.setTitle("Mr");
         
         studentPartTime.setHoursPerWeek(4);
         studentPartTime.setCourse("Hibernate");
         
         
        
        // session.save(student);
         session.save(studentfull);
         session.save(studentPartTime);
         
         session.getTransaction().commit();
         session.close();
         //student ..... Ditached / persistent identity ... java identity .... but there is no relation btn java id and persistent id
        
         
    }
}
