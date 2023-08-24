package com.java9.feature1;

// car and bike has same code driving so duplicate code we have
// solution - we need private method so that we can write it onces.
interface vehicle{
	
	default void car() {System.out.println("Car is driving");};
	
	default void bike() {System.out.println("Bike is driving");};
}

// this is solution - private method
interface updatedVehicle1{
	default void car() {drive("car");};
	
	default void bike() {drive("bike");};
	
	private void drive(String vehicleName) {
		System.out.println(vehicleName + " is driving");
	}
}

public class PrivateMethodInsideInterface implements updatedVehicle1{

	public static void main(String[] args) {
		updatedVehicle1 u = new PrivateMethodInsideInterface();
		u.car();
		u.bike();
	}

}
