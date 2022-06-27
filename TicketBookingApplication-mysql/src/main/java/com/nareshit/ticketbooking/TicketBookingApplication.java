package com.nareshit.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.ticketbooking.model.Ticket;
import com.nareshit.ticketbooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{

	//I want to create a dummy Ticket During every time when we run the code

	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//When ever we run our spring boot application ==> Run method wil be called only once.
		//Generally in real time we use this for static data purpose

/*
		Ticket ticket =new Ticket();
		ticket.setPassengerName("RAMU");
		ticket.setSourceStation("HYDERABAD");
		ticket.setDestinationStation("CHENNAI");
		ticket.setEmail("ramu@gmail.com");
		ticket.setTravelDate(new Date());
		ticketService.createTicket(ticket);
		*/


	}

}
