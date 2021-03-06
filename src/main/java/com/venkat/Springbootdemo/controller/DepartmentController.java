package com.venkat.Springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/department")
	public List<Department> fetchDepartmentList() {
		return departmentService.fetchDepartmentList();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fetchDepartmentById(departmentId);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepartmentById(departmentId);
		return "Department Deleted Successfully";
	}
	
	@PutMapping("/department/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, 
			@RequestBody Department department) {
		return departmentService.updateDepartment(departmentId, department);
	}
	
	@GetMapping("/department/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
		return departmentService.fetchDepartmentByName(departmentName);
	}
}
