package com.ibm.day2.ex;

public class ExDemo {

	public static void main(String[] args) {

		int i = 10;
		int j = 0; // 0, 5
		try {
			int k = i / j; //
			System.out.println(k);
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}

//package com.ibm.day2.ex;
//
//public class ExDemo {
//	
//	public static void main(String[] args) {
//		
////		int i = 10;
////		int j = 0;
////		int k = i / j; // 
////		System.out.println(k);
//		
////		int[] arr = {10, 20, 30};
////		
////		System.out.println(arr[3]);
//		
//	}
//
//}
