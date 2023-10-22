package com.sanjay.flyweightPattern;

public class RoboticDog implements Irobot {
	private String type;
	private Sprites body;
	
	public RoboticDog(String type, Sprites body) {
		this.type = type;
		this.body = body;
	}

	

	public String getType() {
		return type;
	}



	public Sprites getBody() {
		return body;
	}



	@Override
	public void display(int x, int y) {
		// TODO Auto-generated method stub

	}

}
