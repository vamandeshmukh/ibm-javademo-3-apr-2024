package com.ibm.day2.oop.in;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		HdfcBank bank1 = new HdfcBank();
		bank1.payInterest();
		bank1.doKyc();
		
		IciciBank bank2 = new IciciBank();
		bank2.payInterest();
		bank2.doKyc();

	}

}


class C1 {

}

class C2 extends C1 {

}

class C3 extends C1 {
	

}

//class C4 extends C1, C2 {
//	
//}


