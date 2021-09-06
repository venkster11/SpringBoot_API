package com.venkat.Springbootdemo.service;

import java.util.List;

import com.venkat.Springbootdemo.entity.Department;

public interface DepartmentService {

	public Department saveDepartement(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId);

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
