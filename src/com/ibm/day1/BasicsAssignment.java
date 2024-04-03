package com.ibm.day1;

public class BasicsAssignment {

	public static String findBerthType(int berthNumber) {
		
//		berthNumber 1-72

		String response = "";
		String typeOfBerth = ""; // lower, middle, upper, side-lower, side-upper
		
		if (berthNumber >= 1 && berthNumber <= 72) {
			if (berthNumber % 8 == 1 || berthNumber % 8 == 4)
				typeOfBerth = "lower";
			else if (berthNumber % 8 == 2 || berthNumber % 8 == 5)
				typeOfBerth = "middle";
			else if (berthNumber % 8 == 3 || berthNumber % 8 == 6)
				typeOfBerth = "upper";
			else if (berthNumber % 8 == 7)
				typeOfBerth = "side-lower";
			else
				typeOfBerth = "side-upper";
		} else {
			typeOfBerth = "'Invalid'";
		}
		response = "The berth number you've entered is " + berthNumber + " which is " + typeOfBerth + ".";
		return response;
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 73; i++) {
			System.out.println(BasicsAssignment.findBerthType(i));
		}

	}

}
