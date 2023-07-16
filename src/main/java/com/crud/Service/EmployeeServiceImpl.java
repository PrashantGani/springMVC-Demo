package com.crud.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.Employee;
import com.crud.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();		
	}

	@Override
	public void deleteById(long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployeeById(long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()->new NoSuchElementException("No Employee found for the given"+id));
		return employee;
	}

	@Override
	public Employee getEmployeeById(long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(()->new NoSuchElementException("No Employee found for the given"+id));
		return employee;
	}

}
