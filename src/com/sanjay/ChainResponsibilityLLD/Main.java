package com.sanjay.ChainResponsibilityLLD;

public class Main {

	public static void main(String[] args) {
		LogProcessor logObject = new DebugLogProcessor(new ErrorLogProcessor(new InfoLogProcessor(null)));
		logObject.log(LogProcessor.ERROR, "error");
		logObject.log(LogProcessor.DEBUG, "debug");
		logObject.log(LogProcessor.INFO, "info");
	}

}
