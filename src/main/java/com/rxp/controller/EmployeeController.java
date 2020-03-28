package com.rxp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rxp.entity.Employee;
import com.rxp.service.RxpEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired RxpEmployeeService employeeServiceImpl;
	@RequestMapping("/save")
	public Employee saveEmployee(@ModelAttribute("employee") Employee employee){
		System.out.println("inside save method");
		return employeeServiceImpl.saveEmployee(employee);
	}
	
	@PostMapping("/getEmployee")
	public Employee getEmployee(@RequestParam("eid") int employeeId){
		return employeeServiceImpl.getEmployee(employeeId);
	}
	
	@PostMapping("/loadEmployee")
	public Integer loadEmployee(@RequestParam("eid") int employeeId){
		Employee employee =  employeeServiceImpl.loadEmployee(employeeId);
		int age = employee.getAge();
		return age;
	}
	
}
