package com.sanjay.FactoryDesignPattern;

public class GetPlanFactory {
	
	public Plan getPlan(String plan) {
		if(plan.equalsIgnoreCase("DOMEstic")) {
			return new DomesticPlan();
		}else if(plan.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}else if(plan.equalsIgnoreCase("institutionalPlan")) {
			return new InstitutionalPlan();
		}else {
			return null;
		}
	}
}
