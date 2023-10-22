package com.sanjay.StrategyPattern;

public class Substraction implements Strategy {

	@Override
	public double cal(float a, float b) {
		return a-b;
	}

}
