package com.crud.Service;

import java.util.List;

import com.crud.Entity.Employee;

public interface EmployeeService {

	void saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void deleteById(long id);

	Employee updateEmployeeById(long id);

	Employee getEmployeeById(long id);
}
