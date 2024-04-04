package com.ibm.day2.oop;

public class ClassDemo {

	static void gstBillPrint(double amount) {
		double gst = 18;
		double billAmount = amount + (amount * (gst / 100));
		System.out.println(billAmount);
	}

	public static void main(String[] args) {
		
		ClassDemo.gstBillPrint(350);
		ClassDemo.gstBillPrint(500);
		ClassDemo.gstBillPrint(950);


	}

}

//package com.ibm.day2.oop;
//
//public class ClassDemo {
//
////	class members - variables, methods, constructors
//
//	int num = 10;
//	int num2 = 20;
//
//	void m1() {
//
//	}
//
//	void m2() {
//
//	}
//
//	public ClassDemo() {
//
//	}
//	
//	public static void main(String[] args) {
//		
//	}
//
//}
