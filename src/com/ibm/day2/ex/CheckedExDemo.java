package com.ibm.day2.ex;

public class CheckedExDemo {

	public static void main(String[] args) {

		System.out.println("One");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Two");

	}

}
