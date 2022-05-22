package com.aglistech.hibernatelearn.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentWithExam {
	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory =  new Configuration()
				.configure("com/aglistech/hibernatelearn/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create session
		Session currentSession = factory.getCurrentSession();

		try {
			// create object
			Student tempStudent = new Student("Roby", "Permana", "permana@mail.com");
			List<String> tempExams = new ArrayList<String>();
			tempExams.add("Bio1_sem1");
			tempExams.add("Bio2_sem1");
			tempExams.add("Bio3_sem1");
			tempExams.add("Bio4_sem1");
			tempExams.add("Bio1_sem1");
			tempStudent.setExams(tempExams);

			// begin transaction
			currentSession.beginTransaction();

			// save object
			System.out.println("saving data");
			currentSession.persist(tempStudent);

			// commit transaction
			currentSession.getTransaction().commit();
		} finally {
			// clean up code
			currentSession.close();
			factory.close();
		}
	}

}
