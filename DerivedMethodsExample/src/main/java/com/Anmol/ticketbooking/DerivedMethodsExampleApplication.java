package com.Anmol.ticketbooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Anmol.ticketbooking.service.PersonService;



import com.Anmol.ticketbooking.model.Person;
@SpringBootApplication
public class DerivedMethodsExampleApplication implements CommandLineRunner{
	
	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(DerivedMethodsExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		createPersons();
//		getPersons();
//		 findByLastName();
//		findByLastNameOrFirstName();
//		findByLastNameAndFirstName();
//		findByLastNameOrderByCreateDateDesc();
//		findByAgeLessThanEqual();
//		findByFirstNameLike();
//		findByLastNameAndAgeLessThanEqual();
//		findByCreatedDateBetween();
		findByCreatedDateBetweenwithTime();
		
	}
	
	private void createPersons() {
		
		List<Person> personList = Arrays.asList(
				new Person("Kiran", "kumar", "kiran@gmail.com", 20),
				new Person("Ram", "kumar", "ram@gmail.com", 22),
				new Person("RamKiran", "LaxmiKiran", "sita@gmail.com", 30),
				new Person("Lakshamn", "Seth", "seth@gmail.com", 50),
				new Person("Sita", "Kumar", "lakshman@gmail.com", 50),
				new Person("Ganesh", "Kumar", "ganesh@gmail.com", 50),
				new Person("KiranKiran", "kumar", "kiran@gmail.com", 20),
				new Person("RamRam", "kumar", "ram@gmail.com", 22),
				new Person("RamKiranRamKiran", "LaxmiKiran", "sita@gmail.com", 30),
				new Person("RamKiranRamKiran", "Seth", "seth@gmail.com", 50),
				new Person("SitaSita", "Kumar", "lakshman@gmail.com", 50),
				new Person("GaneshSita", "Kumar", "ganesh@gmail.com", 50));
		
		Iterable<Person> list = personService.savePersonsData(personList);
		for (Person person : list) {
			System.out.println("Person Object" + person.toString());
			
		}
		
		
	}
	
	private void getPersons() {
		List<Integer> personList = new ArrayList<Integer>();
		personList.add(1);
		personList.add(2);
		personList.add(12);
		personList.add(5);
		personList.add(6);
		personList.add(20);
		personList.add(40);
		personList.add(11);
		personList.add(15);
		personList.add(3);
		personList.add(4);
		Iterable<Person> personsList = personService.getPersonData(personList);
		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}
	}
	
	private void findByLastName() {
		Iterable<Person> personsList = personService.findByLastName("kumar");
		for (Person person : personsList) {
			System.out.println("Person Object"+person.toString());
		}
	}
	
	private void findByLastNameOrFirstName() {
		Iterable<Person> personsList = personService.findByLastNameOrFirstName("kumar","Ram");
		for (Person person : personsList) {
			System.out.println("Person Object"+person.toString());
		}
	}
	
	private void findByLastNameAndFirstName() {
		Person person = personService.findByLastNameAndFirstName("kumar","Ram");
		
			System.out.println("Person Object"+person.toString());
		
	}

   private void findByLastNameOrderByCreateDateDesc() {
	   Iterable<Person> personsList = personService.findByLastNameOrderByCreateDateDesc("kumar");
		for (Person person : personsList) {
			System.out.println("Person Object"+person.toString());
		}
   }
   private void findByAgeLessThanEqual() {
	   Iterable<Person> personsList = personService.findByAgeLessThanEqual(30);
		for (Person person : personsList) {
					System.out.println("Person Object"+person.toString());
		}   
  
}

   private void findByFirstNameLike() {
	   Iterable<Person> personsList = personService.findByFirstNameLike("%Kiran%");
		for (Person person : personsList) {
			System.out.println("Person Object"+person.toString());
		}
   }
   
   private void findByLastNameAndAgeLessThanEqual() {
	   Iterable<Person> personsList = personService.findByLastNameAndAgeLessThanEqual("Kiran", 20);
		for (Person person : personsList) {
			System.out.println("Person Object"+person.toString());
		}
	
}
   
   private Date getDatewithTime(String dateString) {
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   
	   try {
		return format.parse(dateString);
	} catch (ParseException pe) {
		// TODO: handle exception
		throw new RuntimeException(pe);
	}
	
}
   
   private Date getDate(String dateString ) {
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    
	   try {
		   
		   
		   return format.parse(dateString);
		   
		
	} catch (ParseException pe) {
		// TODO: handle exception
		throw new RuntimeException(pe);
		
	}
}
   
   private void findByCreatedDateBetween() {
		Iterable<Person> personsList = personService.findByCreateDateBetween(
				getDate("2022-06-28"),
				getDate("2022-06-29"));

		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}
}
   
   private void findByCreatedDateBetweenwithTime() {
		//2021-10-18 21:57:03
		Iterable<Person> personsList = personService.findByCreateDateBetween(
				getDatewithTime("2022-06-28 11:56:51"),
				getDatewithTime("2022-06-28 11:57:00"));

		for (Person person : personsList) {
			System.out.println("Person Object" + person.toString());

		}

	}
}
