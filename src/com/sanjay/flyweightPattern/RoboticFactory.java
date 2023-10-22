package com.sanjay.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
	private static Map<String, Irobot>roboticObjectCacheMap = new HashMap<>();
	
	public static Irobot createRobot(String robotType) {
		if(roboticObjectCacheMap.containsKey(robotType)) {
			return roboticObjectCacheMap.get(robotType);
		}else {
			if(robotType=="HumanoidRobot") {
				Irobot humanoidIrobot = new HumanoidRobot(robotType, new Sprites());
				roboticObjectCacheMap.put(robotType, humanoidIrobot);
				return humanoidIrobot;
			}else if(robotType=="RoboticDog") {
				Irobot roboticDog = new RoboticDog(robotType, new Sprites());
				roboticObjectCacheMap.put(robotType, roboticDog);
				return roboticDog;
			}
		}
		return null;
		
	}
}
