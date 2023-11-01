package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList() {
		//LOGGER.info("Inside fethDepartmentList of DepartmentController");
		return employeeService.searchEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public Employee searhEmployeeById(@PathVariable("id") Long id) 
	{
        return employeeService.searchEmployeeById(id);
	}   
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployee(id);
		return "Employee Deleted Successfully!!";
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") Long id,
            @RequestBody Employee employee) {
		return employeeService.updateEmployee(id,employee);
	}
	}
	

	