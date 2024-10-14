package com.demo.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	
	@Column(name="marks")
	private int marks;
	
	@Column(name="name")
	private String name;

}
