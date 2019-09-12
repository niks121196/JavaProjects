package com.beans;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter; 
@Entity  
@Table(name="emp220")  
class Employee1 {    

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int employeeId;    
	private String name;
	private String email;  
	
	@OneToOne(mappedBy="address",cascade=CascadeType.ALL)  
	private Address address;  
	public int getEmployeeId() {  
		return employeeId;  
	}  
	public void setEmployeeId(int employeeId) {  
		this.employeeId = employeeId;  
	}  
	public String getName() {  
		return name;  
	}  
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getEmail() {  
		return email;  
	}  
	public void setEmail(String email) {  
		this.email = email;  
	}  
	public Address getAddress() {  
		return address;  
	}  
	public void setAddress(Address address) {  
		this.address = address;  
	}    

}    

@Entity  
@Table(name="address220")  
class Address1 {    

	@Id  
	@Column(name="emp_id")
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property", value="employee"))
	private int addressId;    
	private String addressLine1,city,state,country;    
	private int pincode;    

	@OneToOne
	@PrimaryKeyJoinColumn
	private Employee employee;  
	public int getAddressId() {  
		return addressId;  
	}  
	public void setAddressId(int addressId) {  
		this.addressId = addressId;  
	}  
	public String getAddressLine1() {  
		return addressLine1;  
	}  
	public void setAddressLine1(String addressLine1) {  
		this.addressLine1 = addressLine1;  
	}  
	public String getCity() {  
		return city;  
	}  
	public void setCity(String city) {  
		this.city = city;  
	}  
	public String getState() {  
		return state;  
	}  
	public void setState(String state) {  
		this.state = state;  
	}  
	public String getCountry() {  
		return country;  
	}  
	public void setCountry(String country) {  
		this.country = country;  
	}  
	public int getPincode() {  
		return pincode;  
	}  
	public void setPincode(int pincode) {  
		this.pincode = pincode;  
	}  
	public Employee getEmployee() {  
		return employee;  
	}  
	public void setEmployee(Employee employee) {  
		this.employee = employee;  
	}    
}  
