package com.example.demo.Service;

import java.util.List;


import com.example.demo.Entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> searchEmployee();

	Employee searchEmployeeById(Long employeeId);

	void deleteEmployee(Long employeeId);

	Employee updateEmployee(Long employeeId, Employee employee);


}
