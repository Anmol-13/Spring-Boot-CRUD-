package com.Anmol.ticketbooking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table(name = "tbl_person")
@NamedQueries(value = {
		@NamedQuery(name = "Person.giveDatawithFirstName",
				query = "SELECT p FROM Person p where p.firstName=?1"),
		@NamedQuery(name = "Person.giveFewColumns",
				query = "SELECT new com.Anmol.ticketbooking.model.CustomType(p.firstName,p.lastName,p.age) from Person p where p.firstName=?1"
				)
})
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private Integer personId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "created_date")
	private Date createDate;
	
	@Column(name = "email")
	private String email;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person( String firstName, String lastName, String email,Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createDate = new Date();
		this.email = email;
	}

	public Person(String firstName, String lastName, Integer age, Date createDate, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.createDate = createDate;
		this.email = email;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", createDate=" + createDate + ", email=" + email + "]";
	}
	
	

}
