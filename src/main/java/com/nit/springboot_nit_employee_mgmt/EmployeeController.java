package com.nit.springboot_nit_employee_mgmt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/well")
	public String well() 
	{
		return "this is well endpoint";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {

		return "Welcome to Employee Management System";
	}

}
