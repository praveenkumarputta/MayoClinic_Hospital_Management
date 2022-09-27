package com.GoAir.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")

public class Passenger {

	@Id
	@Column(name = "pnr")
	private Integer pnr;

	@Column(name = "passengername")
	private String passengerName;

	@Column(name = "ticketprice")
	private Double ticketPrice;

	@Column(name = "email")
	private String email;

	@Column(name = "journeydate")
	private Date journeyDate;

	@Column(name = "mobilenumber")
	private long mobileNumber;

	@Column(name = "from")
	private String from;

	@Column(name = "to")
	private String to;

	public Integer getPnr() {
		return pnr;
	}

	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Passenger [pnr=" + pnr + ", passengerName=" + passengerName + ", ticketPrice=" + ticketPrice
				+ ", email=" + email + ", journeyDate=" + journeyDate + ", mobileNumber=" + mobileNumber + ", from="
				+ from + ", to=" + to + "]";
	}

}
