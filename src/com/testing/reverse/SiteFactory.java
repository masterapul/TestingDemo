package com.testing.reverse;

public class SiteFactory {
	public CommonStep commonStep() {
		
		return new CommonStep(this);
	}
	public String printname() {
		return "santosh";
	}

}
