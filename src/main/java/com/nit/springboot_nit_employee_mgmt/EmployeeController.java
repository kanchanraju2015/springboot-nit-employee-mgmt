package com.nit.springboot_nit_employee_mgmt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping("/well")
	public String well() {
		return "Welcome to Employee Management System";
	}

}
