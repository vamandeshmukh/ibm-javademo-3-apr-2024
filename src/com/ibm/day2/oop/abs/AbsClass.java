package com.ibm.day2.oop.abs;

public abstract class AbsClass {

	public abstract void absMethod();

}

class ConcreteClass extends AbsClass {

	@Override
	public void absMethod() {
		System.out.println("abstract method implemented in a concrete class");
	}

}

//package com.ibm.day2.oop.abs;
//
//public class AbsClass {
//
//	// features - fields
//	// functionalities - methods
//
////	// concrete methods (normal methods)- have both method signature and body
////	public void doKyc() // method signature - What does this method do?
////	{ // method body - How does it do it?
////		System.out.println("do kyc");
////	}
//
////	public int addNums(int i, int j) {
////		return i + j;
////	}
//
////	// concrete methods (normal methods)- have both method signature and body
////	public void doKyc() {
////		System.out.println("do kyc");
////	}
////
////	// abstract methods - have only method signature, no body
////    // abstract method -  can be written only in abstract class or interface 
////	public abstract void doKyc();
//
//}
