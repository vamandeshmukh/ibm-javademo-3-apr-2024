package com.ibm.day3.col;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {

		ArrayList friendsList = new ArrayList();

		System.out.println(friendsList.size()); // 0

		friendsList.add("Sonu");
		friendsList.add("Monu");
		friendsList.add("Tonu");

		System.out.println(friendsList);
		System.out.println(friendsList.size()); // 3 
		
		friendsList.remove(0);

		System.out.println(friendsList);
		System.out.println(friendsList.size()); // 3 
		
		friendsList.add(1045);

		System.out.println(friendsList);
		System.out.println(friendsList.size()); // 3 
		

	}

}
