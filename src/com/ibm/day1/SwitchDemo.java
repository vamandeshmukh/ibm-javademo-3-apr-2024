package com.ibm.day1;

public class SwitchDemo {

	public static void main(String[] args) {

		String str = "b";

		switch (str) {
		case "a":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
			break;
		case "c":
			System.out.println("C");
			break;
		default:
			System.out.println("Other");
		}

	}

}
