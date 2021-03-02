package com.psglobal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String phoneNumber;
	private String name;
	private String mailId;
	private long principalAmount;
	private int years;
	private long interestAmount;
	private long totalAmount;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(long principalAmount) {
		this.principalAmount = principalAmount;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public long getInterestAmount() {
		return interestAmount;
	}
	public void setInterestAmount(long interestAmount) {
		this.interestAmount = interestAmount;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
}
