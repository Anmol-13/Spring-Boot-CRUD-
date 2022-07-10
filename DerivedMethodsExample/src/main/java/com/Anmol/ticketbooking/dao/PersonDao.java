package com.Anmol.ticketbooking.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Anmol.ticketbooking.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>{
	
	public Iterable<Person> findByLastName(String lastName) ;
	
	public Person findByLastNameAndFirstName(String lastName,String firstName); 
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName);
	
	public Iterable<Person> findByLastNameOrderByCreateDateDesc(String lastName);
	
	public Iterable<Person> findByAgeLessThanEqual(Integer age);
	
	public List<Person>  findByFirstNameLike(String firstName);
	
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int Age);
	
	public List<Person> findByCreateDateBetween(Date startdate,Date endDate); 
	
	

}
