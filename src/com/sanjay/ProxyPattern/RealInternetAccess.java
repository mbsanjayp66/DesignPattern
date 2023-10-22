package com.sanjay.ProxyPattern;

public class RealInternetAccess implements OfficeInternetAcces {
	String employeeName;
	
	public RealInternetAccess(String EmpName) {
		employeeName = EmpName;
	}
	@Override
	public void grantInternetAcces() {
		System.out.println("Grant Access to the Employee:"+employeeName);
	}

}
