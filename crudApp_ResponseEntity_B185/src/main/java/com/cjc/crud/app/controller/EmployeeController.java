package com.cjc.crud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.crud.app.model.Employee;
import com.cjc.crud.app.service.EmployeeService;

@RestController
public class EmployeeController {


	
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Employee e){
		es.addEmployeeData(e);
		return new ResponseEntity<String>("Employee Data Added !!",HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> deleteSingle(@PathVariable ("eid")int eid)
	{
		
		es.deleteSingleRecord(eid);
		
		return new ResponseEntity<String>("Single Data Deleted",HttpStatus.OK);
			
	}
	
	@DeleteMapping("/deleteall")
	public ResponseEntity<String> deleteAll()
	{
		
		es.deleteAllRecords();
		
		return new ResponseEntity<String>("All Data Deleted",HttpStatus.OK);
		
	}
}
