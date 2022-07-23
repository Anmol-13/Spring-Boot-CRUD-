package com.Anmol.ticketbooking.dao;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Anmol.ticketbooking.model.CustomType;
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
	
	public Iterable<Person> giveDatawithFirstName(String firstName) ;
	
	public Iterable<CustomType> giveFewColumns(String lastName);
	
//	@Query(value = "SELCT p FROM Person p where p.firstName =?1 OR p.email=?2")
//	List<Person> findPersonInfobyFirstNameorEmail(String firstName,String email);
//	
//	@Query(value = "SELECT * FROM tbl_person p where p.first_name=?1",nativeQuery = true)
//	List<Person> findPersonInfobyFirstName(String firstName);
	
	public List<Person> findByLastName(String lastName,PageRequest pageRequest) ;

}
