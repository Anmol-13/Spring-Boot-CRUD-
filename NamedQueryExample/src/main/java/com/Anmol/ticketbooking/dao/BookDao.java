package com.Anmol.ticketbooking.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Anmol.ticketbooking.model.Book;
import com.Anmol.ticketbooking.model.Person;

@Repository
public interface BookDao extends CrudRepository<Book, Integer>{
	
	public Iterable<Book> fetchBookByName(String bookName) ;
}
