package com.aglistech.hibernatelearn;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aglistech.hibernatelearn.student.Status;
import com.aglistech.hibernatelearn.student.Student;

public class CreateStudentDemo {
	public static void main(String[] args) {
		//Create factory
		SessionFactory factory = new Configuration()
				.configure("com/aglistech/hibernatelearn/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create object
			Student tempStudent = new Student("Rio", "Bambanga", "rio@mail.com", Status.ACTIVE);
			Student tempStudent2 = new Student("Bunga", "Permata", "bg@mail.com", Status.INACTIVE);
			
			//begin transaction
			session.beginTransaction();
			//save object
			session.persist(tempStudent);
			session.persist(tempStudent2);
			System.out.println("Done!");
			
			//commit
			session.getTransaction().commit();
			
		} finally {
			//cleaun code
			session.close();
			factory.close();
		}
	}
}
