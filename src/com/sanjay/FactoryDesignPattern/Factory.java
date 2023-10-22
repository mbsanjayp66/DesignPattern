package com.sanjay.FactoryDesignPattern;

public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		Plan plan;
		plan = getPlanFactory.getPlan("DOMEstic");
		if(plan==null) {
			System.out.println("null");
		}else {
			plan.getRate();
			plan.calBill(20);
		}
		
	}

}
