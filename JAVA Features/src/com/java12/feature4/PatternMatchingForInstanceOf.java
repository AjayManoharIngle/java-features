package com.java12.feature4;

public class PatternMatchingForInstanceOf {

	// here no need to type case to string from object
	// we can directly write in declarations
	
	public static void main(String[] args) {
		Object obj = "Hello World!";
		traditional(obj);
		newWay(obj);
	}

	private static void newWay(Object obj) {
		if (obj instanceof String s) {
		    int length = s.length();
		    System.out.println(length);
		}
	}

	private static void traditional(Object obj) {
		if (obj instanceof String) {
		    String s = (String) obj;
		    int length = s.length();
		    System.out.println(length);
		}
	}

}
