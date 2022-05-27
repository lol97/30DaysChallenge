package com.aglistech.hb_4_map_collection_sortedset;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aglistech.hb_4_map_collection_sortedset.student.Student;

public class GetStudentDemoImage {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
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
