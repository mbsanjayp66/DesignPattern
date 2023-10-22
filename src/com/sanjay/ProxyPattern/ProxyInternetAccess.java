package com.sanjay.ProxyPattern;

public class ProxyInternetAccess implements OfficeInternetAcces {
	private String empName;
	private RealInternetAccess realInternetAccess;
	
	public ProxyInternetAccess(String empName) {
		this.empName = empName;
	}
	@Override
	public void grantInternetAcces() {
		if(getRole(empName)>3) {
			realInternetAccess = new RealInternetAccess(empName);
			realInternetAccess.grantInternetAcces();
		}
	}
	public int getRole(String empString){
		return 9;
	}
}
