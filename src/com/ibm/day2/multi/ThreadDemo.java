package com.ibm.day2.multi;

public class ThreadDemo {

	public static void main(String[] args) {

		ThreadClass obj = new ThreadClass();
		obj.start();
		ThreadClass obj2 = new ThreadClass();
		obj2.start();
		ThreadClass obj3 = new ThreadClass();
		obj3.start();
	}

}

//package com.ibm.day2.multi;
//
//public class ThreadDemo {
//	
//	public static void main(String[] args) {
//		
//		ThreadClass obj = new ThreadClass();
//		obj.printNums();
//		ThreadClass obj2 = new ThreadClass();
//		obj2.printNums();
//		
//	}
//
//}
