package com.aglistech.hb_4_map_collection_sortedset;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aglistech.hb_4_map_collection_sortedset.student.Student;

/**
 * Hello world!
 *
 */
public class CreateStudentImageSortedSetDemo {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		try {
			// create object
			Student tempStudent = new Student("rony", "permana", "mama@mail.com");
			Set<String> images = tempStudent.getImages();
			images.add("photos1.jpg");
			images.add("photos2.jpg");
			images.add("photos3.jpg");
			images.add("photos4.jpg");
			images.add("photos4.jpg");
			
			
			// begin transaction
			session.beginTransaction();
			
			//save object
			session.persist(tempStudent);
			
			// commit
			session.getTransaction().commit();
		} finally {
			// cleanup code
			session.close();
			factory.close();
		}	
	}
}
