package com.disney.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Booking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private Date date;
	private BigDecimal totalBookingAmount;
	private List<String> component;
	private Custmer customer;
	private String packageType;
	
	
	
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public BigDecimal getTotalBookingAmount() {
		return totalBookingAmount;
	}
	public void setTotalBookingAmount(BigDecimal totalBookingAmount) {
		this.totalBookingAmount = totalBookingAmount;
	}
	public List<String> getComponent() {
		return component;
	}
	public void setComponent(List<String> component) {
		this.component = component;
	}
	public Custmer getCustomer() {
		return customer;
	}
	public void setCustomer(Custmer customer) {
		this.customer = customer;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Booking [Id=" + Id + ", date=" + date + ", totalBookingAmount="
				+ totalBookingAmount + ", component=" + component
				+ ", customer=" + customer + ", packageType=" + packageType
				+ "]";
	}
	
	
	
	

}
