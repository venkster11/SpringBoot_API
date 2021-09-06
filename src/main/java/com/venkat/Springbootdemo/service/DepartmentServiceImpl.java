package com.venkat.Springbootdemo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venkat.Springbootdemo.entity.Department;
import com.venkat.Springbootdemo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartement(Department department) {
	
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartmentById(Long departmentId) {
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	@Override
	public Department updateDepartment(Long departmentId, Department department) {
		Department depDB = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName()) ) {
			depDB.setDepartmentName(department.getDepartmentName());
		}
		
		if(Objects.nonNull(department.getDeapartmentCode()) && !"".equalsIgnoreCase(department.getDeapartmentCode()) ) {
			depDB.setDeapartmentCode(department.getDeapartmentCode());
		}
		
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress()) ) {
			depDB.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		return departmentRepository.save(depDB);
	}

}
