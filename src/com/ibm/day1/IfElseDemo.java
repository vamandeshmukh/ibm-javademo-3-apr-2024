package com.ibm.day1;

public class IfElseDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		if (num1 > num2) {
			System.out.println("yes");
		} else if (num2 > num1) {
			System.out.println("no");
		} else {
			System.out.println("something else");
		}
	}
}
