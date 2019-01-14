package com.testing.reverse;

public class CommonStep {
	
	private static SiteFactory factory;
	public CommonStep(SiteFactory factory) {
		//this.factory=factory;
		
	}
	public static void main(String[] args) {
		factory.commonStep();
		factory.printname();
	}

}
