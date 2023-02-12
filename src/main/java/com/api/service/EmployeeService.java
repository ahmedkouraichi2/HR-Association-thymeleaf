package com.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Employee;
import com.api.repository.EmployeeRepository;

import lombok.Data;

@Data
@Service
public class EmployeeService {
	
	   @Autowired
	    private EmployeeRepository employeeRepository;
	   
	   public Optional<Employee> getEmployee(final Long id){
		   return employeeRepository.findById(id);
		   
	   }
	   
	   public Iterable<Employee> getEmployee(){
		   return employeeRepository.findAll();
	   }
	   
	   public void deleteEmployee(final Long id){
		   employeeRepository.deleteById(id);
		   
	   }
	   
	   public Employee saveEmployee(Employee employee) {
		   Employee saveEmployee = employeeRepository.save(employee);
		   return saveEmployee;
	   }

}
