package com.employee.service;

import com.employee.entity.Employee;

public class EmployeeService {
	
	static Employee employee;
	
	public static void addEmployee(Employee em) {
		
		employee=(new Employee(em.getEmpid(),em.getEname(),em.getEsalary()));
	}

	public static Employee detailsEmployee() {
		
		return employee;
	}
}
