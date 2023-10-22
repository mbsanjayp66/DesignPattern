package com.sanjay.AdapterPattern;

public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		setBankName("SBI");
		setAccHolderName("Sanjay");
		setAcNumber(107117089);
	}

	@Override
	public String getCreditCard() {
		String name = getAccHolderName();
		String bankName = getBankName();
		int acNumber = getAcNumber();
		return name+" "+bankName+" "+acNumber;
	}

}
