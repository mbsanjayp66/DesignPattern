package com.sanjay.DecoratorPattern;

public class DecoderMain {

	public static void main(String[] args) {
		BasePizza pizza = new ExtraMushroom(new ExtraCheese(new Margherita()));
		System.out.println("cost:"+pizza.cost());
	}

}
