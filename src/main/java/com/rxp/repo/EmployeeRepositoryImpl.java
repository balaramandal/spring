package com.rxp.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rxp.entity.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Autowired SessionFactory sessionFactory;
	//@Autowired SessionFactory sessionFactory;
	//@Autowired HibernateTemplate hibernateTemplate;
	@Autowired Session session;
	public Employee saveEmployee(Employee employee) {
		try{
			//Session session = sessionFactory.openSession();
			session.save(employee);
			return employee;
		}catch(Exception exception){
			return null;
		}
	}
	
	public Employee getEmployee(int employeeId) {
		try{
			//Session session = sessionFactory.openSession();
			Employee employee = session.get(Employee.class, employeeId);
			return employee;
		}catch(Exception exception){
			return null;
		}
	}

	public Employee loadEmployee(int employeeId) {
		try{
			//Session session = sessionFactory.openSession();
			Employee employee = session.load(Employee.class, employeeId);
			return employee;
		}catch(Exception exception){
			return null;
		}
	}

}
