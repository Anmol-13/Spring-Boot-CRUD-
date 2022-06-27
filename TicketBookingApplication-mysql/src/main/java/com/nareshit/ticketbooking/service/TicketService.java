package com.nareshit.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.ticketbooking.dao.TicketDao;
import com.nareshit.ticketbooking.model.Ticket;

@Service
//All Middlware service capabilities like transaction mgmt,Logging,etc..

public class TicketService {

	// We need to write our Business Logic in to this service layer

	// We already created DAO ==> TicketDao.java ==> CrudRepository ==> CRUD
	// OPERATIONS

	// Spring Core Annotation to get the reference of TicketDao

	@Autowired
	private TicketDao ticketDao; // TicketDao ticketDao=new TicketDao();

	// Create Ticket

	public Ticket createTicket(Ticket ticketObj) {

		return ticketDao.save(ticketObj);

		// Save is the CRUD Repository Implemenation for inserting the data or updating
		// the data

		// ticketObj.ticketId ==> null or not given ==> Insert the data

		// ticketObj.getTicketId()==100 ==> Not there in database ==> Insert the data

		// If ticketObj.getTicketId() ==> Exists in the datbase ==>It will udpate the
		// data

	}

	// Retrieve Tickets

	public Iterable<Ticket> getAllTickets() {
		return ticketDao.findAll();

		// findAll ==> select * from tbl_ticket;

		// ORM framework will convert the result set into java class
		// rs("ticket0").("name")==ticket.setPassengername(rs[0][1]));

	}

	// Retrieve Ticket(Not all Tickets)

	public Ticket getTicket(Integer ticketId) {

		// select * from tbl_ticket where ticket_id=ticketId;

		return ticketDao.findById(ticketId).orElse(new Ticket());

	}

	// Update Ticket

	public Ticket updateTicket(Integer ticketId, String newEmail) {

		// update tbl_ticket set email=newEmail where ticket_id=ticketId

		Ticket dbTicketObj = getTicket(ticketId);

			dbTicketObj.setEmail(newEmail);
			return ticketDao.save(dbTicketObj);


	}

	// Delete Ticket

	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
		//deleteById ==> delete from tbl_ticket where ticket_id=ticketId;
	}

	public Iterable<Ticket> findByPassengerName(String passengerName){
		return ticketDao.findByPassengerName(passengerName);
	}

}
