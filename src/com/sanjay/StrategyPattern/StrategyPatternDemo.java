package com.sanjay.StrategyPattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new Multiplication());
		
		System.out.println(context.cal(2, 3));
	}

}
