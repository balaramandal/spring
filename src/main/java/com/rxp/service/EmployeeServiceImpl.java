package com.rxp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rxp.entity.Employee;
import com.rxp.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements RxpEmployeeService {
	
	@Autowired EmployeeRepository employeeRepo;
	public Employee saveEmployee(Employee employee){
		return employeeRepo.saveEmployee(employee);
	}
	
	public Employee getEmployee(int employeeId) {
		return employeeRepo.getEmployee(employeeId);
	}

	public Employee loadEmployee(int employeeId) {
		Employee employee = employeeRepo.loadEmployee(employeeId);
		int age = employee.getAge();
		return employee;
	}
}
