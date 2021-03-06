package com.aglistech.hibernatelearn;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aglistech.hibernatelearn.student.Address;
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
			Student tempStudent = new Student("Rio", "Bambanga", "rio@mail.com");
			Address homeAddress = new Address("Jalan Cikoko", "Jakarta", "13543");
			tempStudent.setHomeAddress(homeAddress);
			
			Address billAddress = new Address("Jalan Jagapura", "Cirebon", "45164");
			tempStudent.setBilliAddress(billAddress);
			
			//begin transaction
			session.beginTransaction();
			//save object
			session.persist(tempStudent);
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
