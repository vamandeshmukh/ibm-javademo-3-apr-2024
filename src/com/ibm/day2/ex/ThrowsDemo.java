package com.ibm.day2.ex;

public class ThrowsDemo {
	
	

	// Your friend's car 
	public static void printNums() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			// option 1 - handle ex here
			Thread.sleep(500); // here ex may be raised
		}
	}

	// Your friend
	public static void callToPrint() throws InterruptedException  {
		// option 2 - handle ex here
//		try {
			ThrowsDemo.printNums();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

	// You 
	public static void main(String[] args) throws InterruptedException {
		// option 3 - handle ex here
		ThrowsDemo.callToPrint();
	}

}

//package com.ibm.day2.ex;
//
//public class ThrowsDemo {
//
//	public static void printNums() throws InterruptedException {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			Thread.sleep(500);
//		}
//	}
//
//	public static void main(String[] args) {
//
//		try {
//			ThrowsDemo.printNums();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}

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
