package com.ibm.day2.oop.encap;

// Encapsulation - 
// data and code are bound together 
// make the fields as private
// make public methods to access those fields 

public class EncapDemo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
//		emp.salary = 10.5;
		emp.setSalary(10.5);
		System.out.println(emp.getSalary());
		
	}

}
