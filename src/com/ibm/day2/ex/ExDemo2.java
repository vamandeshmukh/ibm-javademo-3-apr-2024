package com.ibm.day2.ex;

import java.util.Scanner;

public class ExDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an integer: ");
		int i = sc.nextInt();

		System.out.println("Please enter another integer: ");
		int j = sc.nextInt();

		try {
			System.out.println(i / j);
		} catch (Exception e) {
			System.out.println("Do not enter zero");
		}
	}
}
