package com.ibm.day2.oop;

public class Employee {

	int employeeId;
	String firstName;
	double salary;

	public Employee() {
		System.out.println("default constructor");
	}

// 		public Employee(int eid, String name, double sal) {
//		System.out.println("parameterized constructor");
//		this.employeeId = eid;
//		this.firstName = name;
//		this.salary = sal;
//	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	String getEmployeeData() {
		return "Employee id: " + employeeId + " Name: " + firstName + " salary: " + salary;
	}

}
