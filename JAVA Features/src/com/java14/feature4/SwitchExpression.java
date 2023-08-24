package com.java14.feature4;

public class SwitchExpression {

	public static void main(String[] args) {
		
		System.out.println(java13feature());
		System.out.println(java14feature());
	}

	private static String java14feature() {
		String data="WED";
		String returnData = "";
		returnData = switch(data) {
		
		case "MON","TUE","WED","THUR","FRI" : yield "WeekDays : " + data;

		case "SAT","SUN" : yield "Weekend : " + data;
		default : yield "";
		};
		return returnData;
	}

	private static String java13feature() {
		String data="SUN";
		
		return switch(data) {
		
		case "MON","TUE","WED","THUR","FRI" : yield "WeekDays : " + data;

		case "SAT","SUN" : yield "Weekend : " + data;
		default : yield "";
		};
	}
}
