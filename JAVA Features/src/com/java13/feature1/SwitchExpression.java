package com.java13.feature1;

public class SwitchExpression {

	public static void main(String[] args) {
		
		// added yield keyword instead of lambda expression
		System.out.println(java12Feature());
		System.out.println(java13feature());
	}

	private static String java13feature() {
		String data="SUN";
		
		return switch(data) {
		
		case "MON","TUE","WED","THUR","FRI" : yield "WeekDays : " + data;

		case "SAT","SUN" : yield "Weekend : " + data;
		default : yield "";
		};
	}

	private static String java12Feature() {
		String data="MON";
		
		return switch(data) {
		
		case "MON","TUE","WED","THUR","FRI"->"WeekDays : " + data;

		case "SAT","SUN"->"Weekend : " + data;
		default -> "";
		};
	}
}
