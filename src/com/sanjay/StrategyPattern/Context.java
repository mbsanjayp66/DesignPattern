package com.sanjay.StrategyPattern;

public class Context {
	Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public double cal(float a,float b) {
		return strategy.cal(a, b);
	}
}
