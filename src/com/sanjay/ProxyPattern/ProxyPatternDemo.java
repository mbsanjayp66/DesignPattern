package com.sanjay.ProxyPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		OfficeInternetAcces officeInternetAcces = new ProxyInternetAccess("sanjay");
		officeInternetAcces.grantInternetAcces();
	}

}
