package com.java9.feature1;

// we can use static method inside interafce but it can not override implementaion class
interface updatedVehicle2{
	default void car() {drive("car");};
	
	default void bike() {drive("bike");};
	
	static void drive(String vehicleName) {
		System.out.println(vehicleName + " is driving");
	}
}

public class StaticMethodInInterface {

	public static void main(String[] args) {
		
		updatedVehicle2.drive("Bike");
		updatedVehicle2.drive("Car");
	}
}
