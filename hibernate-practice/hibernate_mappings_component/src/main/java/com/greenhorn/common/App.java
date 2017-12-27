package com.greenhorn.common;

import org.hibernate.Session;

import com.greenhorn.model.Address;
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
    	 System.out.println("Maven + Hibernate + MySQL");
    	 
         Student student = new Student();  // student instantiation state .....
         
         Address presentAdd = new Address();
         
         Address permAdd = new Address();
         
         Session session = HibernateUtil.getSessionFactory().openSession();
         
         session.beginTransaction();
         
         presentAdd.setStreet("ABC");
         presentAdd.setCity("HYD");
         presentAdd.setState("TS");
         presentAdd.setZipcode("23566");
         
         permAdd.setStreet("XYZ");
         permAdd.setCity("BANGALORE");
         permAdd.setState("KA");
         permAdd.setZipcode("567");
         
         student.setFirstName("Harish"); // persistent identity -- primary key and java identity 
         student.setLastName("V");
         student.setTitle("Mr");
         student.setPresentAdd(presentAdd);
         student.setPermAdd(permAdd);
         
         session.save(student);
         
         
         System.out.println(student);
         
         session.getTransaction().commit();
         
         session.close();
        
         
    }
}
