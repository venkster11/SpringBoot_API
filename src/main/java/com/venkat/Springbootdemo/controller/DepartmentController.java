package com.venkat.Springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.Springbootdemo.entity.Department;
import com.venkat.Springbootdemo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.saveDepartement(department);
	}
}
