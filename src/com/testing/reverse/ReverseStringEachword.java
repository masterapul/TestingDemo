package com.testing.reverse;

public class ReverseStringEachword {

	public static void main(String[] args) {
		System.out.println(ReverseStringEachword.getStringValue("Love you indaia"));
		
		

	}
	//simple logic to reverse each word of a string
	public static String getStringValue(String str) {
		String reverse="";
		String result[]=str.split("//");
		for(String reverseString:result) {
			StringBuilder sb=new  StringBuilder(reverseString);
			sb.reverse();
			reverse=sb.toString()+" ";
		}
		
		
		return reverse.trim();
		
	}

}
