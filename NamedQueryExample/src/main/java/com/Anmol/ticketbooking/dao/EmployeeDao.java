package com.Anmol.ticketbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Anmol.ticketbooking.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	public List<Object[]> findMaxSalariesByDept(List<String> deptNames);

}
