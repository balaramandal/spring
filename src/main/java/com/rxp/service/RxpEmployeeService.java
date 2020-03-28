package com.rxp.service;

import com.rxp.entity.Employee;

public interface RxpEmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee getEmployee(int employeeId);
	public Employee loadEmployee(int employeeId);
}
