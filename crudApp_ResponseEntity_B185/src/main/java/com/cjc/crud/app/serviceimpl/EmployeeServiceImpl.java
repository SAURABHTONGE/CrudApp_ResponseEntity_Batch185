package com.cjc.crud.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.app.model.Employee;
import com.cjc.crud.app.repository.EmployeeRepository;
import com.cjc.crud.app.service.EmployeeService;
@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeRepository er;
	
	@Override
	public void addEmployeeData(Employee e) {
		er.save(e);
	}

}
