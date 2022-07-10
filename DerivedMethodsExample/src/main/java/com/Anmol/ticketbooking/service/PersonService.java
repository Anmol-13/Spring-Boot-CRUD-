package com.Anmol.ticketbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anmol.ticketbooking.dao.PersonDao;
import com.Anmol.ticketbooking.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	public Iterable<Person> savePersonsData(Iterable<Person> persons) {
		return personDao.saveAll(persons);
		
	}
	
	public Iterable<Person> getPersonData(Iterable<Integer> personIds) {
		return personDao.findAllById(personIds);
		
	}
	
	public Iterable<Person> findByLastName(String lastName) {
		return personDao.findByLastName(lastName);
	}
	
	public Person findByLastNameAndFirstName(String lastName,String firstName) {
		return personDao.findByLastNameAndFirstName(lastName, firstName);
	}
	
	public Iterable<Person> findByLastNameOrFirstName(String lastName,String firstName){
		return personDao.findByLastNameOrFirstName(lastName, firstName);
	}
	
	public Iterable<Person> findByLastNameOrderByCreateDateDesc(String lastName){
		return personDao.findByLastNameOrderByCreateDateDesc(lastName);
	}
	
	public Iterable<Person> findByAgeLessThanEqual(Integer age){
		return personDao.findByAgeLessThanEqual(age);
	}
	
	public List<Person>  findByFirstNameLike(String firstName){
		return personDao.findByFirstNameLike(firstName);
	}
	
	public List<Person> findByLastNameAndAgeLessThanEqual(String lastName,int Age){
		return personDao.findByLastNameAndAgeLessThanEqual(lastName, Age);
	}
	
	public List<Person> findByCreateDateBetween(Date startdate,Date endDate){
		return personDao.findByCreateDateBetween(startdate, endDate);
				
		
	}


}
