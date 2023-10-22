package com.sanjay.CommandPattern;

public class MyRemoteController {
	Icommand icommand;
	public MyRemoteController(Icommand ic) {
		this.icommand = ic;
	}
	public void pressButton() {
		this.icommand.execute();
	}
}
