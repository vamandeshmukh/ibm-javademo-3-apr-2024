package com.ibm.day2.ex;

public class ThrowsDemo {

	public static void printNums() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}

	public static void main(String[] args) {

		try {
			ThrowsDemo.printNums();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

//package com.ibm.day2.ex;
//
//public class ThrowsDemo {
//
//	public static void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//
//		ThrowsDemo.printNums();
//
//	}
//
//}
