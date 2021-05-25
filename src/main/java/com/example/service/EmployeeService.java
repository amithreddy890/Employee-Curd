package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.exceptions.EmployeeExistsException;
import com.example.exceptions.EmployeeNotFoundException;
import com.example.model.Employee;

public interface EmployeeService {

	//List<Employee> getAllEmployee();

	Optional<Employee> getEmployeeById(String empId) throws EmployeeNotFoundException;

	Employee addEmployee(Employee employee) throws EmployeeExistsException;

	Employee updateEmployee(String empId, Employee emp) throws EmployeeNotFoundException;

	void deleteEmployee(String empId);

	List<Employee> getAllEmployee();
}
