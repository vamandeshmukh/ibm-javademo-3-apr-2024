package com.ibm.day3.col;

public class ArrayDemo {

	public static void main(String[] args) {

		String[] myFriends = { "Sonu", "Monu", "Tonu" };
		System.out.println(myFriends[2]);

		myFriends[2] = "Ponu";
		System.out.println(myFriends[2]);

//		myFriends[3] = "Gonu";
//		System.out.println(myFriends[3]);

		System.out.println(myFriends.length);

		for (String friend : myFriends) {
			System.out.println(friend);
		}
	}
}
