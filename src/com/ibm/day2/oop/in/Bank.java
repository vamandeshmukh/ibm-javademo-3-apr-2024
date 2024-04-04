package com.ibm.day2.oop.in;

interface GovtOfIndia {

	public abstract void doKyc();

}

interface StateGovt {

}

class Rbi {

	public void payInterest() {
		System.out.println("Pay interest on deposits");
	}
}

//class HdfcBank implements GovtOfIndia, StateGovt { }

class HdfcBank extends Rbi implements GovtOfIndia, StateGovt {

	@Override
	public void doKyc() {
		System.out.println("KYC done with Aadhaar");
	}

}

class IciciBank extends Rbi implements GovtOfIndia, StateGovt {

	@Override
	public void doKyc() {
		System.out.println("KYC done with PAN Card");

	}

}

public class Bank {

}
