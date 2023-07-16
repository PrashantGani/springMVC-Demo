package com.crud.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.Entity.Employee;
import com.crud.Service.EmployeeService;

@Controller

public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/Employee")
	public String viewForm() {
		return "emp_registration";
	}

	@RequestMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("status", "Employee Details saved...");
		employeeService.saveEmployee(employee);
		return "emp_registration";
	}

	@RequestMapping("/all")
	public String getAllEmployee(Model model) {
		List<Employee> allEmployee = employeeService.getAllEmployee();
		model.addAttribute("list", allEmployee);
		return "list_employee";
	}

	@RequestMapping("/delete")
	public String deleteById(@RequestParam long id, Model model) {
		employeeService.deleteById(id);
		List<Employee> allEmployee = employeeService.getAllEmployee();
		model.addAttribute("list", allEmployee);
		return "list_employee";
	}

	@RequestMapping("/update")
	public String updateEmployeeById(@RequestParam long id, Model model) {
		Employee employee = employeeService.updateEmployeeById(id);
		model.addAttribute("list", employee);
		return "emp_update";
	}

	@RequestMapping("/updateEmp")
	public String updateEmployee(@ModelAttribute Employee employee, Model model) {
		employeeService.saveEmployee(employee);
		List<Employee> allEmployee = employeeService.getAllEmployee();
		model.addAttribute("list", allEmployee);
		return "list_employee";
	}

	@RequestMapping("/one")
	public String enterEmpId() {
		return "emp_byId";
	}

	@RequestMapping("/getById")
	public String getEmployeeById(@RequestParam long id, Model model) {
		Employee list = employeeService.getEmployeeById(id);
		model.addAttribute("employee", list);
		return "Emp_by_id";
	}
}
