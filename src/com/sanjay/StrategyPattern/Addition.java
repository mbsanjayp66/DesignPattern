package com.sanjay.StrategyPattern;

public class Addition implements Strategy {

	@Override
	public double cal(float a, float b) {
		return a+b;
	}

}
