package com.aglistech.hibernatelearn.student;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "student")
@NoArgsConstructor
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
	
	private Address homeAddress;
	
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "BILLING_CITY")),
		@AttributeOverride(name = "street", column = @Column(name = "BILLING_STREET")),
		@AttributeOverride(name = "zipcode", column = @Column(name = "BILLING_ZIPCODE"))
	})
	private Address billiAddress;

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
