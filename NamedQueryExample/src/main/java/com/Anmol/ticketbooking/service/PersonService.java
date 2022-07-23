package com.Anmol.ticketbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Anmol.ticketbooking.dao.BookDao;
import com.Anmol.ticketbooking.dao.EmployeeDao;
import com.Anmol.ticketbooking.dao.PersonDao;
import com.Anmol.ticketbooking.model.Book;
import com.Anmol.ticketbooking.model.CustomType;
import com.Anmol.ticketbooking.model.Employee;
import com.Anmol.ticketbooking.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
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
	
	public Iterable<Person> giveDatawithFirstName(String firstName) {
		return personDao.giveDatawithFirstName(firstName);
	}
	
	public Iterable<Book> saveAllBooks(Iterable<Book>booksData) {
		return bookDao.saveAll(booksData);
		
	}
	
	public Iterable<Book> findAllBooks(){
		return bookDao.findAll();
	}
	
	public Iterable<Book> fetchBookByName(String bookName) {
		return bookDao.fetchBookByName(bookName);
	}
	
	public Iterable<CustomType> giveFewColumns(String lastName) {
		return personDao.giveFewColumns(lastName);
		
	}
	
	public Iterable<Employee> saveAllEmployees(Iterable<Employee> empList) {
		return employeeDao.saveAll(empList);
		
	}

	public List<Object[]> findMaxSalariesByDept(List<String> deptNames) {
		// TODO Auto-generated method stub
		return employeeDao.findMaxSalariesByDept(deptNames);
	}
	
	public List<Person> findByLastName(String lastName,PageRequest pageRequest) 
	{
		return personDao.findByLastName(lastName, pageRequest);

}
}