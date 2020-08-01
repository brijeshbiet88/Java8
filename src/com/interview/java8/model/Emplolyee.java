package com.interview.java8.model;

import java.util.ArrayList;
import java.util.List;

public class Emplolyee {

	private String empId ;
	private String name ;
	private List<String> techStack ;
	
	public Emplolyee(String empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
		techStack = new ArrayList<String>();
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTechStack() {
		return techStack;
	}
	public void setTechStack(List<String> techStack) {
		this.techStack = techStack;
	}
}
