package com.imooc.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Employee implements Serializable {
	private int empid;
	private String empname;
	
	// 添加一个项目的集合
	private Set<Project> projects = new HashSet<Project>();

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String empname) {
		this.empid = empid;
		this.empname = empname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}
