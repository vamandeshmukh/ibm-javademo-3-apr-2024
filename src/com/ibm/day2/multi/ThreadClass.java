package com.ibm.day2.multi;

//public class ThreadClass extends Thread {
public class ThreadClass extends Thread {

	@Override
	public void run() {
		printNums();
	}

	void printNums() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//package com.ibm.day2.multi;
//
//public class ThreadClass {
//
//	void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
