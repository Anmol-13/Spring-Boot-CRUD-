package com.nareshit.ticketbooking.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //JPA will create a table with name as Ticket
@Table(name="tbl_ticket") //@Table is an Optional
//If we want datababase table name with a different name other than class name.
// create table tbl_ticket
public class Ticket {

	/*
	 *
	 * CREATE TABLE TBL_TICKET(
	 * PASSENGER_NAME VARCHAR(),
	 * TRAVEL_DATE DATETIME,
	 * SOURCE_STATION..
	 * DESTINATION_sTATION
	 * EMAIL,
	 * ticketId primary_key)
	 */

	//By default every property of the java class is a database column

	@Id //This wil create primarykey
	@Column(name="ticket_id")
	@GeneratedValue(strategy = GenerationType.AUTO) //AUTO Generation
	//AUTO ==> JPA WILL CREATE A DATABASE SEQUENCE TO DB AND IT WILL GENERATE VALUE USING SEQUENCE
	//IDNEITY ==> DATABASE ONLY WILL TAKE CARE OF SEQUENCE GENERATION AUTO_INCREMENT
	private Integer ticketId;

	@Column(name="passenger_name")
	//@Column is als optional. If we want database column value other than java property Name
	private String passengerName;


	@Column(name="travel_date")
	private Date travelDate;

	@Column(name="source_station")
	private String sourceStation;

	@Column(name="destination_station")
	private String destinationStation;


	private String email;


	public Integer getTicketId() {
		return ticketId;
	}


	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}


	public String getPassengerName() {
		return passengerName;
	}


	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getSourceStation() {
		return sourceStation;
	}


	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}


	public String getDestinationStation() {
		return destinationStation;
	}


	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Ticket( String passengerName, Date travelDate, String sourceStation,
			String destinationStation, String email) {
		super();
		this.passengerName = passengerName;
		this.travelDate = new Date();
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.email = email;
	}

	public Ticket() {}


	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", travelDate=" + travelDate
				+ ", sourceStation=" + sourceStation + ", destinationStation=" + destinationStation + ", email=" + email
				+ "]";
	}




}
