package com.greenhorn.hibernate.common;
 
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.greenhorn.hibernate.model.Employee;
import com.greenhorn.hibernate.model.Meeting;
import com.greenhorn.hibernate.persistence.HibernateUtil;
 
public class App {
 
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
/*        
        Meeting meeting1 = new Meeting("Quaterly Sales meeting");
        Meeting meeting2 = new Meeting("Weekly Status meeting");
        
        Employee employee1 = new Employee("Sergey", "Brin");
        Employee employee2 = new Employee("Larry", "Page");
        Employee employee3 = new Employee("Sandeep", "R");
        Employee employee4 = new Employee("Sunil", "S");

        employee1.getMeetings().add(meeting1); // emp 1 having both meeting 
        employee2.getMeetings().add(meeting1); // don't have weelky meeting 
        employee1.getMeetings().add(meeting2);
        employee3.getMeetings().add(meeting2);
        employee4.getMeetings().add(meeting2);
        
        session.save(employee1);
        session.save(employee2);
        session.save(employee3);
        session.save(employee4);
        */
        
        Meeting meeting = (Meeting) session.load(Meeting.class, 1L); 
        System.out.println(meeting.getSubject());
        Set<Employee>  emplist = meeting.getEmployees();
        System.out.println("         "+emplist.size());
       
        //
        if(emplist.size()!=0) {
        	
        	for(int i=0; i<=emplist.size(); i++) {
        		System.out.println(emplist.iterator().next());
        	}
 /*       for(Employee emp : emplist) {
        
        System.out.println("LASTNAME :: "+emp.getFirstname());
        	
        }*/
        
        }
        /*  Employee employee = (Employee) session.load(Employee.class, 2L); // first query 
        
      Set<Meeting> meetingsForEmpNo1 = employee.getMeetings();
        
        System.out.println(" For Emploee :   "+ employee.getFirstname());
        
        if(meetingsForEmpNo1.size()!=0) {// Second query 
        	
        	for(Meeting meeting : meetingsForEmpNo1 ) {
        		
        		System.out.println(meeting.getSubject() +" :  "+ meeting.getMeetingDate());
        		
        	}
        	
        }*/
        
        session.getTransaction().commit();
        session.close();
    }
}