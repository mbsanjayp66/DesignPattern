package com.sanjay.FactoryDesignPattern;

abstract class Plan {
	protected double rate;

	abstract void getRate();
	
	void calBill(int unit) {
		System.out.println(rate*unit);
	}
	
}
