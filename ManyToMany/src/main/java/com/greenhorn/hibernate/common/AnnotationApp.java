package com.greenhorn.hibernate.common;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.greenhorn.hibernate.model.EmployeeAnnotation;
import com.greenhorn.hibernate.model.Meeting;
import com.greenhorn.hibernate.model.MeetingAnnotation;
import com.greenhorn.hibernate.persistence.HibernateUtil;
 
public class AnnotationApp {
 
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
        
        MeetingAnnotation meeting1 = new MeetingAnnotation("Quaterly Sales meeting");
        MeetingAnnotation meeting2 = new MeetingAnnotation("Weekly Status meeting");
        
        EmployeeAnnotation employee1 = new EmployeeAnnotation("Sunil", "S");
        EmployeeAnnotation employee2 = new EmployeeAnnotation("Sandeep", "R");

        employee1.getMeetings().add(meeting1);
        employee1.getMeetings().add(meeting2);
        employee2.getMeetings().add(meeting1);
        
        session.save(employee1);
        session.save(employee2);
        
        session.getTransaction().commit();
        session.close();
    }
}