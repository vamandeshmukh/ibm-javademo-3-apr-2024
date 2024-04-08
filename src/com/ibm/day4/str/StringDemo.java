package com.ibm.day4.str;

public class StringDemo {

	String someVariable = "abc";

	public static void main(String[] args) {

		String str = "abcdefghi";

		char[] chArray = str.toCharArray();
		String str2 = str.toUpperCase();
		String str3 = str2.toLowerCase();

		String str5 = "abc", str6 = "Abc";
		System.out.println(str.equalsIgnoreCase(str6));

	}
}