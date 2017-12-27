package com.yoga.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session hbmSession = sessionFactory.openSession();
        hbmSession.beginTransaction();
        
/*        Employee emp = new Employee();
        
        emp.setAge(27);
        
        EmpPersonalDetails empp = new EmpPersonalDetails();
        
        empp.setFirstName("Sugat12");
        empp.setLastName("Misra12");
        
        emp.setEmpPersonalDetails(empp);
        empp.setEmployee(emp);
        hbmSession.save(emp);*/
       
      /*  Employee empResults = (Employee) hbmSession.load(Employee.class, 1);
        
        System.out.println(empResults.getEmpNo()+" :: "+empResults.getAge()+" :: "+empResults.getEmpPersonalDetails());*/
        
       /* EmpPersonalDetails empDetails = (EmpPersonalDetails)hbmSession.load(EmpPersonalDetails.class, 1);
        
        System.out.println(empDetails.getEmpNo());
        System.out.println(empDetails.getFirstName());
        System.out.println(empDetails.getLastName());
        System.out.println(empDetails.getEmployee());*/
       // empp.setEmployee(emp);
        //hbmSession.save(empp);
        
/*        EmployeeAnotation emp = new EmployeeAnotation();
        
        emp.setEmpName("JHON");
        
        PersonalDetailsAnotation empp = new PersonalDetailsAnotation();
        
        empp.setAdharNumber(12345678L);
        empp.setPanNumber("CTS6500TR2R");
        empp.setPassPortNumber("ABCD123456XYZ");
        
        emp.setEmpPersonalDetails(empp);
        hbmSession.save(empp);
        empp.setEmployee(emp);
        hbmSession.save(emp);*/
        
  /*      EmployeeAnotation empano =  (EmployeeAnotation) hbmSession.load(EmployeeAnotation.class, 2);
        System.out.println(empano.getEmpPersonalDetails());
        */
        PersonalDetailsAnotation personalDetails = (PersonalDetailsAnotation) hbmSession.load(PersonalDetailsAnotation.class, 2);
        System.out.println(personalDetails.getEmployee());
        EmployeeAnotation employee = personalDetails.getEmployee();
        System.out.println(employee.getEmpPersonalDetails());
        
        
        hbmSession.getTransaction().commit();
        hbmSession.close();
    }
}
