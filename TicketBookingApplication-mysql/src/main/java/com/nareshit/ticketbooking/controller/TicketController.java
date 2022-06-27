package com.nareshit.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;

@RestController
//This class will be registered to Dispatcher Servlet

@RequestMapping(value = "/tickets") // http://locahost:8080/tickets

//When ever we hit //http://locahost:8080/tickets ==> Dispatcher servlet will initialize TicketController

//TicketController controller=ioc.getTicketController();
public class TicketController {

	// Complete RestController is designed with JAX - RS FRAMEWORK

	// Java Implemented WebServices Framework through JAX - WS and JAX - RS
	// technologies

	// Web Service ==> Cross Language Interaction ==> Hetergenious interoporable
	// communication Media

	// JAX - WS ==> SOAP SERVICES ==> JAVA API FOR XML WEBSERVICES

	// JAX - RS ==> Java API for XML Rest Services

	// ARITEL ==> pre Pay , Post Pay, Promotions,Discounts, Tariffis, Bill plans ,
	// Generations, Payments,
	// == > New Upcoming stragies, Customer ratings...

	// Promotions,Discounts, Tariffis==> Main Frames
	// Bill plans , Generations, Payments ==> SAP System
	// New Upcomin plan, stratgegies ==> AI,
	// Reproring ==> PowerBuider,Shell, MSBI
	// Back End ==> Oracle
	// Front end ==> Angular, REact, ..

	// REST SERVICES ==> WE NO NEED TO WRITE ANY WSDL,SCHEMA,XSD,XML, CONTRACT AND
	// PRE DEFINED DATA OBJECTS
	// no Specific Protocols like SOAP,TCP, UDP, it always runs on HTTP Common
	// Protocol

	// 4 OPERATIONS ==> 4 VERBS ==> GET VERB ==> GET THE DATA
	// ==> POST VERB ==> CREATE THE DATA // POST ==> CREATE // no update
	// ==> PUT VERB ===> UPDATE THE DATA // PUT ==> CREATE / UPDATE
	// ==> DELETE VERB ==> DELETE THE DATA

	// Spring boot came with little bit advance features with JAX RS framework
	// Get Operation ==> @Get ==> to call get Verb
	// @RequestMapping ==>
	// @GetMapping ==> @Get + @RequestMapping
	// @PostMapping ==> @Post + @RequestMapping...

//Also , Spring Boot has an internal library called as JACKSON Library which is used to convert java object
	// JSON Object and JSON Object to JAVA Object.

	// Autowire Service Method
	@Autowired
	private TicketService ticketService;

	// RETRIEVE ALL TICKETS

	@GetMapping(value = "/all") // http://localhost:8080/tickets/all
	// controller.getTickets();
	/// Output will be convert to JSON..ie.Iterable<Ticket> will be converted to
	// JSON format
	public Iterable<Ticket> getTickets() {
		return ticketService.getAllTickets();
	}

	// CREATE TICKET
	// @PostMapping ==> @Post+ @RequestMapping

	@PostMapping(value = "/create") // http://localhost:8080/tickets/create
	public Ticket createTicket(@RequestBody Ticket ticketObj) {

		return ticketService.createTicket(ticketObj);

	}

	// RETRIEVE SPECIFIC TICKET
	// http://localhost:8080/tickets/all ==> All Tickets
	// http://localhost:8080/tickets/1 ===> select * from ticket where ticket_id=1
	// http://localhost:8080/tickets/2 ===> select * from ticket where ticket_id=2
	// Enclosing in { } ==> Representing a pathVariable
	// @PathVariable ==> Annotation reads the url and gets the value 1 or 2
	/* @GetMapping(value = "/{ticketId}")
	public Ticket getTicket(@PathVariable("ticketId") Integer ticketId) {

		return ticketService.getTicket(ticketId);

	}
	*/


	 @GetMapping(value = "/{passengerName}")
		public Iterable<Ticket> getTicket(@PathVariable("passengerName") String passengerName) {

			return ticketService.findByPassengerName(passengerName);

		}
	// UPDATE TICKET

	// @PutMapping ==> @Put + @RequestMapping
	@PutMapping(value = "/{ticketId}/{newEmail}") // http://localhost:8080/tickets/1/a@gmail.com
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {

		return ticketService.updateTicket(ticketId, newEmail);
	}

	// DELETE TICKET

	@DeleteMapping(value = "/{ticketId}") //http://localhost:8080/tickets/1
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {

		ticketService.deleteTicket(ticketId);

	}

}
