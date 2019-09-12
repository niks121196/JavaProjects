package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "employee1021")  
@Inheritance(strategy=InheritanceType.JOINED)  

public class Employee {  
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  

	@Column(name = "id")  
	private int id;  

	@Column(name = "name")  
	private String name;  

	public Employee() {}

	public Employee(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}	
	
	
}
