package com.ibm.day1;

public class BasicsAssignment {

	public static void findBerthType(int berthNumber) {

		String berthType = ""; // lower, middle, upper, side-lower, side-upper

		// your code
		if (berthNumber >= 1 && berthNumber <= 72) {
			if (berthNumber % 8 == 1 || berthNumber % 8 == 4)
				berthType = "lower";
			else if (berthNumber % 8 == 2 || berthNumber % 8 == 5)
				berthType = "middle";
			else if (berthNumber % 8 == 3 || berthNumber % 8 == 6)
				berthType = "upper";
			else if (berthNumber % 8 == 7)
				berthType = "side-lower";
			else
				berthType = "side-upper";
		} else {
			berthType = "'Invalid'";
		}

		System.out.println("Your berth number is " + berthNumber + " which is " + berthType + ".");

	}

	public static void main(String[] args) {
		for (int i = 0; i <= 73; i++) {
			BasicsAssignment.findBerthType(i);
		}

	}

}
