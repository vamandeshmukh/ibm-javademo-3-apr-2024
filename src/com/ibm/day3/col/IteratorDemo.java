package com.ibm.day3.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> myFriends = new ArrayList<>();

		myFriends.addAll(Arrays.asList("Sonu", "Monu", "Ponu", "Gonu"));

		System.out.println(myFriends);
		System.out.println(myFriends.size());

		System.out.println("Iterate collection using for loop:");
		for (int i = 0; i < myFriends.size(); i++) {
			System.out.println(myFriends.get(i));
		}

		System.out.println("Iterate collection using for each loop:");
		for (String friend : myFriends) {
			System.out.println(friend);
		}

	}

}
