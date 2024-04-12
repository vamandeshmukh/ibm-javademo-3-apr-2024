package com.ibm.day4.anno;

@interface MyAnon {
	
	String val();

}

@MyAnon(val = "abc")
class Class1 {

}

@FunctionalInterface
interface Int {

	void m1();

}

class C1 implements Int {

	@Override
	public void m1() {

	}

}

public class AnnotationDemo {

	public static void main(String[] args) {

	}

}
