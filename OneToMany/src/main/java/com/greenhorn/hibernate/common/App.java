package com.greenhorn.hibernate.common;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.greenhorn.hibernate.model.Department;
import com.greenhorn.hibernate.model.Employee;
import com.greenhorn.hibernate.persistence.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  SessionFactory sf = HibernateUtil.getSessionFactory();
          Session session = sf.openSession();
          session.beginTransaction();
   
          Department department = new Department();
          department.setDepartmentName("markating");
          session.save(department);
   
          Employee emp1 = new Employee("ABC", "Mayers", "1212");
          Employee emp2 = new Employee("XYZ", "Almeida", "4343");
   
          emp1.setDepartment(department);
          emp2.setDepartment(department);
   
          session.save(emp1);
          session.save(emp2);
          
          Department dept = (Department)session.load(Department.class, 4L);
          
          
          Employee empdata = (Employee)session.load(Employee.class, 8L);
          System.out.println(empdata.getDepartment());
        /*  Set<Employee> empSet = dept.getEmployees();
          for(Employee emp : empSet) {
        	  System.out.println(emp.getEmployeeId()); 
        	 System.out.println(emp.getFirstname());
        	 System.out.println(emp.getDepartment()); 
          }*/
         
   
          session.getTransaction().commit();
          session.close();
    }
}
