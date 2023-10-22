package com.sanjay.flyweightPattern;

public class Main {

	public static void main(String[] args) {
		Irobot human = RoboticFactory.createRobot("HumanoidRobot");
		human.display(0, 0);
		
		Irobot human2 = RoboticFactory.createRobot("HumanoidRobot");
		human.display(1, 1);
	}

}
