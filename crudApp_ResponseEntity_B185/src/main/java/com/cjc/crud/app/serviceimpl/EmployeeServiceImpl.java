package com.cjc.crud.app.serviceimpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public List<Employee> getallEmployee() {
		
		return er.findAll();
	}

	@Override
	public Employee getsingle(int eid) {
		   Optional<Employee> op= er.findById(eid);
		   if(op.isPresent())
		   {
			   Employee e=op.get();
			   return e;
		   }
		System.out.println("Employee with ID " + eid + " not found");
		return null;
	}

	@Override
	public Employee updateEmployeeData(Employee e) {
	Employee save = er.save(e);
		return save;
	}

}
