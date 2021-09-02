package com.venkat.Springbootdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String deapartmentCode;
	
	public Long getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	
	public String getDeapartmentCode() {
		return deapartmentCode;
	}
	
	public void setDeapartmentCode(String deapartmentCode) {
		this.deapartmentCode = deapartmentCode;
	}
	
	public Department(Long departmentId, String departmentName, String departmentAddress, String deapartmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.deapartmentCode = deapartmentCode;
	}
	
	public Department() {
		
	}
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", deapartmentCode=" + deapartmentCode + "]";
	}
	
	

}
