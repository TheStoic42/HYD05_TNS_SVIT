package com.example.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceimplements implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> searchEmployee() {
		return employeeRepository.findAll();
	}

    @Override
    public Employee updateEmployee(Long id,Employee employee) {
	      Employee empDB = employeeRepository.findById(id).get();
	      
	        if(Objects.nonNull(employee.getName()) &&
	        !"".equalsIgnoreCase(employee.getName())) {
	        	empDB.setName(employee.getName());
	        
	        }
    	    
	        if(employee.getDob()!=null) 
	        {
	        	     empDB.setDob(employee.getDob());
	        }
	        
	        if(employee.getSalary()> 0) {
	        empDB.setSalary(employee.getSalary());
	        }
	        
	        if(Objects.nonNull(employee.getAddress()) &&
	        		!"".equals(employee.getAddress())) {
	        	     empDB.setAddress(employee.getAddress());
	        }
    
	        if(Objects.nonNull(employee.getDesignation()) &&
	    	        !"".equalsIgnoreCase(employee.getDesignation())) {
	    	        	empDB.setDesignation(employee.getDesignation());
	    	        
	    	        }

           return employeeRepository.save(empDB);
           
    }
        @Override
        public Employee searchEmployeeById(Long id) {
        	return employeeRepository.findById(id).get();
    	   
       }
       @Override
       public void deleteEmployee(Long id) {
    	   employeeRepository.deleteById(id);
           
     }
}

	
	      
	
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	

