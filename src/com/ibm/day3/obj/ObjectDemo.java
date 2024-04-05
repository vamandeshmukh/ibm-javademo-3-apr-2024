package com.ibm.day3.obj;

public class ObjectDemo {

	public static void main(String[] args) {

//		Employee emp2 = new Employee(102, "Monu", 10.25);

		Employee emp1 = new Employee(101, "Sonu", 10.50);
		Employee emp2 = new Employee(101, "Sonu", 10.50);

//		System.out.println(emp1.toString());

		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));

	}

}
