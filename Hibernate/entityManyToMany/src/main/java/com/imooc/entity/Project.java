package com.imooc.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Project implements Serializable {
	private int proid;
	private String proname;

	// 添加一个员工集合
	private Set<Employee> employees = new HashSet<Employee>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int proid, String proname) {
		this.proid = proid;
		this.proname = proname;
	}

	public int getProid() {
		return proid;
	}

	public void setProid(int proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}


	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [proid=" + proid + ", proname=" + proname + "]";
	}

}
