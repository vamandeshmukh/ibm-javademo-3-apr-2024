package com.ibm.day3.obj;

public class ObjectDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 10.5);

//		System.out.println(emp.getEmployeeId());
//		System.out.println(emp.getFirstName());
//		System.out.println(emp.getSalary());
//		System.out.println(emp.getFirstName() + " " + emp.getSalary() + " " + emp.getEmployeeId());
		
		System.out.println(emp.toString());

	}

}
