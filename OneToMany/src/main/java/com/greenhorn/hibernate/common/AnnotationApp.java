package com.greenhorn.hibernate.common;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.greenhorn.hibernate.model.DepartmentAnnotation;
import com.greenhorn.hibernate.model.Employee;
import com.greenhorn.hibernate.model.EmployeeAnnotation;
import com.greenhorn.hibernate.persistence.HibernateUtil;

public class AnnotationApp {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

/*		DepartmentAnnotation department = new DepartmentAnnotation();
		department.setDepartmentName("Delevery");
		session.save(department);
		
		EmployeeAnnotation emp1 = new EmployeeAnnotation("Nina", "Mayers", "111");
		EmployeeAnnotation emp2 = new EmployeeAnnotation("Tony", "Almeida", "222");

		emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);*/
		DepartmentAnnotation department = (DepartmentAnnotation) session.load(DepartmentAnnotation.class, 5L);
		Set<EmployeeAnnotation> empset = department.getEmployees();
		System.out.println(empset.size());
		

		session.getTransaction().commit();
		session.close();
	}
}
