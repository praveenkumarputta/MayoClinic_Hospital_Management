package com.MayoClinic.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@Column(name = "patientname")
	private String patientName;

	@Column(name = "age")
	private Integer age;

	@Column(name = "sex")
	private String sex;

	@Column(name = "city")
	private String city;

	@Column(name = "phonenumber")
	private Long phoneNumber;

	@Column(name = "emailaddress")
	private String emailAddress;

	@Column(name = "primarylanguage")
	private String primaryLanguage;

	@Column(name = "paymenttype")
	private String paymentType;

	@Column(name = "payment")
	private Double payment;

	@Column(name = "joiningdate")
	private Date joiningDate;

	@Column(name = "dischargedate")
	private Date dischargeDate;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public void setPrimaryLanguage(String primaryLanguage) {
		this.primaryLanguage = primaryLanguage;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", age=" + age + ", sex=" + sex + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + ", primaryLanguage="
				+ primaryLanguage + ", paymentType=" + paymentType + ", payment=" + payment + ", joiningDate="
				+ joiningDate + ", dischargeDate=" + dischargeDate + "]";
	}

}
