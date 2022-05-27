package com.aglistech.hibernatelearn.student;

import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentImageMapDemo {
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
			Map<String, String> tempImages = tempStudent.getImages();
			tempImages.put("image_1", RandomStringUtils.randomAlphabetic(10) + ".jpg");
			tempImages.put("image_2", RandomStringUtils.randomAlphabetic(10) + ".jpg");
			tempImages.put("image_3", RandomStringUtils.randomAlphabetic(10) + ".jpg");
			tempImages.put("image_4", RandomStringUtils.randomAlphabetic(10) + ".jpg");
			tempImages.put("image_5", RandomStringUtils.randomAlphabetic(10) + ".jpg");
			
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
