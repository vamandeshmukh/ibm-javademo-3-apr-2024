package com.ibm.day3.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>();

		myList.addAll(Arrays.asList("Sonu", "Monu", "Ponu", "Gonu"));

		System.out.println(myList);
		System.out.println(myList.size());

		System.out.println("Iterate collection using for loop");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}

		System.out.println("Iterate collection using for each loop");
		for (String element : myList) {
			System.out.println(element);
		}

	}

}
