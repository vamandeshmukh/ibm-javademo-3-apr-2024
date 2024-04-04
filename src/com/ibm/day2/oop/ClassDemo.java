package com.ibm.day2.oop;

public class ClassDemo {

	static void gstBillPrint(double amount) {
		double gst = 18;
		double billAmount = amount + (amount * (gst / 100));
		System.out.println(billAmount);
	}

	static double gstBillCalc(double amount) {
		double gst = 18;
		double billAmount = amount + (amount * (gst / 100));
		return billAmount;
	}

	static double gstPctCalc(double amount, double gst) {
		double billAmount = amount + (amount * (gst / 100));
		return billAmount;
	}

	public static void main(String[] args) {

//		gstBillPrint(350);
//		gstBillPrint(500);
//		gstBillPrint(950);

//		ClassDemo.gstBillPrint(350);
//		ClassDemo.gstBillPrint(500);
//		ClassDemo.gstBillPrint(950);

		double finalBillAmount = ClassDemo.gstPctCalc(200, 6);
		System.out.println(finalBillAmount); // 212

		double finalBillAmount2 = ClassDemo.gstPctCalc(200, 18);
		System.out.println(finalBillAmount2); // 236

		double finalBillAmount3 = ClassDemo.gstPctCalc(200, 12);
		System.out.println(finalBillAmount3); // 224
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
