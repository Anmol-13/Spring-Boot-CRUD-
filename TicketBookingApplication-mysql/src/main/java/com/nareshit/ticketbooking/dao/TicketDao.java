package com.nareshit.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.ticketbooking.model.Ticket;

@Repository

// It will establish a database connection if does not exists
// Framework automated SessionFActory/EntityManagerFactory, Transaction Factory etc..for Database

public interface TicketDao extends CrudRepository<Ticket, Integer> {

	// CRUD OPERATION ==> CREATE READ UPDATE DELETE ==> Automatically takes care of
	// performing CRUD operations

	// Two Inputs are required ==> 1) Model Class Name 2) Datatype of PK.

	// Insert the Data ==> Insert into tbl_ticket

	// Update the Data ==> update tbl_ticket set....

	// retrieve the data ==> Select * from tbl_ticket

	// delete the data ==> delete from tbl_ticket

	// Derived Methods ==> Developer need to write abstract method and framework
	// will implement based on abstract method
	// For abstract method ==> INput and Output can be developer choice
	// But method Name can be having some rules ..

	// Need to write a method which will look the data baesd on passengerName
	//Framework will implement for this abstract method
	public Iterable<Ticket> findByPassengerName(String passengerName);


}
