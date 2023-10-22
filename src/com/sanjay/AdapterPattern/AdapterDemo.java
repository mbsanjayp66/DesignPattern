package com.sanjay.AdapterPattern;

public class AdapterDemo {

	public static void main(String[] args) {
		CreditCard cd1 = new BankCustomer();
		cd1.giveBankDetails();
		System.out.println(cd1.getCreditCard());
	}

}
