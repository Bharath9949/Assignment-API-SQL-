package com.psglobal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InterestRate")
public class InterestRate {
    
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private long fromAmount;
	private long toAmount;
	private int fromYears;
	private int toYears;
	private int interestRate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getFromAmount() {
		return fromAmount;
	}
	public void setFromAmount(long fromAmount) {
		this.fromAmount = fromAmount;
	}
	public long getToAmount() {
		return toAmount;
	}
	public void setToAmount(long toAmount) {
		this.toAmount = toAmount;
	}
	public int getFromYears() {
		return fromYears;
	}
	public void setFromYears(int fromYears) {
		this.fromYears = fromYears;
	}
	public int getToYears() {
		return toYears;
	}
	public void setToYears(int toYears) {
		this.toYears = toYears;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
			
	
}
