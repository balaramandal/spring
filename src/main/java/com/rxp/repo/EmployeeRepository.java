package com.rxp.repo;

import com.rxp.entity.Employee;

public interface EmployeeRepository {
	public Employee saveEmployee(Employee employee);
	public Employee getEmployee(int employeeId);
	public Employee loadEmployee(int employeeId);
}
