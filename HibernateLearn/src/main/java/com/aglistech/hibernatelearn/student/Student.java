package com.aglistech.hibernatelearn.student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lasttName;

	@Column(name = "email")
	private String email;

	@ElementCollection
	@CollectionTable(name = "image", joinColumns = @JoinColumn(name = "student_id"))
	@Column(name = "file_name")
	private Set<String> images = new HashSet<String>();
	
	@ElementCollection
	@CollectionTable(name = "exam", joinColumns = @JoinColumn(name = "student_id"))
	@OrderColumn(name = "seq")
	@Column(name = "exam_name")
	private List<String> exams = new ArrayList<String>();
	
	

	public Student(String firstName, String lasttName, String email) {
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getImages() {
		return images;
	}

	public void setImages(Set<String> images) {
		this.images = images;
	}

	public List<String> getExams() {
		return exams;
	}

	public void setExams(List<String> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email + "]";
	}

}
