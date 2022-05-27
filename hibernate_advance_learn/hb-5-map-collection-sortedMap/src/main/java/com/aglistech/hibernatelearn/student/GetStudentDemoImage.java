package com.aglistech.hibernatelearn.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class GetStudentDemoImage {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("/com/aglistech/hibernatelearn/hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			// begin transaction
			session.beginTransaction();

			// get student by id
			Student student = session.get(Student.class, 1);
			System.out.println("Student " + student);

			// get associated image
			System.out.println(student.getImages());

			// commit transaction
			session.getTransaction().commit();
			
			// print done
			System.out.println("Done");
		} finally {
			// cleanup code
			session.close();
			factory.close();
		}
	}
}
