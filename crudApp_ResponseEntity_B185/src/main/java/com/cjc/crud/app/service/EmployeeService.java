package com.cjc.crud.app.service;

import com.cjc.crud.app.model.Employee;

public interface EmployeeService {

	void addEmployeeData(Employee e);

	public void deleteSingleRecord(int eid);

	public void deleteAllRecords();

	
}
