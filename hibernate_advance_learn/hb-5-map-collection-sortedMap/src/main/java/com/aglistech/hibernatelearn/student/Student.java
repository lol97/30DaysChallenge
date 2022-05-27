package com.aglistech.hibernatelearn.student;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.SortComparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
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
	@CollectionTable(name = "image")
	@MapKeyColumn(name = "file_name")
	@Column(name = "image_name")
	@SortComparator(ReverseStringComparator.class)
	private SortedMap<String, String> images = new TreeMap<String, String>();
	
	//reverse string
	public static class ReverseStringComparator implements Comparator<String>{

		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}
	
	public Student(String firstName, String lasttName, String email) {
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email + "]";
	}

}
