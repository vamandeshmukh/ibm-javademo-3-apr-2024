package com.ibm.day2.oop.inherit;

public class InheritDemo {
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone();
		System.out.println("basic phone");
		phone1.call();
		phone1.sms();
		
		SmartPhone phone2 = new SmartPhone();
		System.out.println("smart phone");
		phone2.call();
		phone2.sms();
		phone2.camera();
	}

}


//DRY - 