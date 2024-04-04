package com.ibm.day2.oop.sta;

public class StaticDemo {

	public static void main(String[] args) {

		int result = Calc.addNums(10, 20);
		System.out.println(result);

//		int result2 = Calc.subNums(10, 5); // CE 

		Calc obj = new Calc();
		int result2 = obj.subNums(10, 5);
		System.out.println(result2);

	}

}
