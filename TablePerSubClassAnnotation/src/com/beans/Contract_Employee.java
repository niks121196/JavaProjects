package com.beans;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity  
@Table(name="contractemployee102")  
@AttributeOverrides({  
	@AttributeOverride(name="id", column=@Column(name="id")),  
	@AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Contract_Employee extends Employee{  

	@Column(name="pay_per_hour")  
	private float pay_per_hour;  

	@Column(name="contract_duration")  
	private String contract_duration;  

	public Contract_Employee() {}

	public Contract_Employee(String name,float pay_per_hour, String contract_duration) {
		super(name);
		this.pay_per_hour = pay_per_hour;
		this.contract_duration = contract_duration;
	}

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration
				+ ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
}
