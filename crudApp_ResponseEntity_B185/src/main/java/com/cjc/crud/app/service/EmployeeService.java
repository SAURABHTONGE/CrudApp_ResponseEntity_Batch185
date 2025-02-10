package com.cjc.crud.app.service;

import java.util.List;

import com.cjc.crud.app.model.Employee;

public interface EmployeeService {

	void addEmployeeData(Employee e);

//<<<<<<< HEAD
	public void deleteSingleRecord(int eid);

	public void deleteAllRecords();

	
//=======
	List<Employee> getallEmployee();

	Employee getsingle(int eid);

	Employee updateEmployeeData(Employee e);

//>>>>>>> branch 'main' of https://github.com/SAURABHTONGE/CrudApp_ResponseEntity_Batch185.git
}
