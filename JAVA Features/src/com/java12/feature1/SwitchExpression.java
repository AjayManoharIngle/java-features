package com.java12.feature1;

public class SwitchExpression {

	public static void main(String[] args) {
		
		traditional();
		System.out.println("+++++++++++++++++++++++++++++++++++");
		newFeature1();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		newFeature2();
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(newFeature3());
	}

	private static String newFeature3() {
		String data="MON";
		
		return switch(data) {
		
		case "MON","TUE","WED","THUR","FRI"->"WeekDays : " + data;

		case "SAT","SUN"->"Weekend : " + data;
		default -> "";
		};
	}

	private static void traditional() {
		
		String data = "SAT";
		
		switch (data) {
		case "MON":
		case "TUE":
		case "WED":
		case "THUR":
		case "FRI":System.out.println("Weekdays.."); break;
		
		case "SAT":;
		case "SUN":System.out.println("Weekend...");break;
		
		default:System.out.println("INVALID...");
		
		}
	}

	private static void newFeature1() {
		
		String data="MON";
		
		switch(data) {
		
		case "MON","TUE","WED","THUR","FRI":System.out.println("Weekdays");break;

		case "SAT","SUN":System.out.println("Weekend....");break;
		
		default:System.out.println("Inavild");
		
		}
	}
	
	private static void newFeature2() {
		
		String data="MON";
		
		switch(data) {
		
		case "MON","TUE","WED","THUR","FRI"->{
			int sum = sum(10,20);
			System.out.println("Weekdays : "+ sum);
		}

		case "SAT","SUN"->System.out.println("Weekend....");		
		}
	}

	private static int sum(int a, int b) {
		return a+b;
	}
}
