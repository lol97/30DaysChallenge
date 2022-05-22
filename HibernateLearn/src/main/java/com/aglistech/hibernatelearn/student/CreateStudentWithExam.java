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
			List<Exam> tempExams = new ArrayList<Exam>();
			tempExams.add(new Exam("Bio1_sem1", 10));
			tempExams.add(new Exam("Bio2_sem1", 40));
			tempExams.add(new Exam("Bio3_sem1", 90));
			tempExams.add(new Exam("Bio4_sem1", 90));
			tempExams.add(new Exam("Bio1_sem1", 20));
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
