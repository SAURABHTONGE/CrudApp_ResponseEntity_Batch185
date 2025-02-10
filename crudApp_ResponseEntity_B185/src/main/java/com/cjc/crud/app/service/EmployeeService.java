package com.cjc.crud.app.service;

import java.util.List;

import com.cjc.crud.app.model.Employee;

public interface EmployeeService {

	void addEmployeeData(Employee e);

	List<Employee> getallEmployee();

	Employee getsingle(int eid);

}
