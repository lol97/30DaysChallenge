package com.aglistech.hibernatelearn;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aglistech.hibernatelearn.user.Instructor;
import com.aglistech.hibernatelearn.user.Student;


public class CreateUserStudentInstructorDemo {
	public static void main(String[] args) {
		//Create factory
		SessionFactory factory = new Configuration()
				.configure("com/aglistech/hibernatelearn/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create object
			Student tempStudent = new Student("Rio", "Bambanga", "rio@mail.com", "Java");
			Instructor tempInstructor = new Instructor("Bunga", "Permata", "bg@mail.com", 10000d);
			
			//begin transaction
			session.beginTransaction();
			//save object
			session.persist(tempStudent);
			session.persist(tempInstructor);
			System.out.println("Done Saving!");
			
			Instructor instructor = session.get(Instructor.class, 1);
			System.out.println(instructor.getSalary());
			
			//commit
			session.getTransaction().commit();
			
		} finally {
			//cleaun code
			session.close();
			factory.close();
		}
	}
}
