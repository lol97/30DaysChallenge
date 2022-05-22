package com.aglistech.hibernatelearn.student;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Exam implements Serializable{
	@Column
	private String name;
	@Column
	private Integer score;
	
	public Exam(String name, Integer score) {
		this.name = name;
		this.score = score;
	}


	public Exam() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
	
}
