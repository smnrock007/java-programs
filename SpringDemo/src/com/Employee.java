package com;

public class Employee {
	
	int employeeId;
	String employeeName;
	String employeeaddr;
	int employeesalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeaddr() {
		return employeeaddr;
	}
	public void setEmployeeaddr(String employeeaddr) {
		this.employeeaddr = employeeaddr;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public void display()
	{
		System.out.println("Display Method");
	}

	
}
