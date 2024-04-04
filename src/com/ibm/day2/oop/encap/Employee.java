package com.ibm.day2.oop.encap;

public class Employee {

	private int employeeId;
	private String firstName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

//package com.ibm.day2.oop.encap;
//
//
//
//public class Employee {
//
//	private int employeeId;
//	private String firstName;
//	private double salary;
//
//	public Employee() {
//		super();
//	}
//
//	public Employee(int employeeId, String firstName, double salary) {
//		super();
//		this.employeeId = employeeId;
//		this.firstName = firstName;
//		this.salary = salary;
//	}
//	
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	
//	public double getSalary() {
//		return salary;
//	}
//
//}
