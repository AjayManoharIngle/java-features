package com.java9.feature1;

// need - In interface if we want to add some other specification then ..
// then complusory we have to override in implemenation classes.

// to avoid this we can add default method in interfaces
interface vehicle1{
	
	default void drive() {System.out.println("Car is driving");};
	void service();
}

public class DefaultMethodInsideInterface implements vehicle1{

	public static void main(String[] args) {
		vehicle1 v = new DefaultMethodInsideInterface();
		v.drive();
		v.service();
	}

	@Override
	public void service() {
		System.out.println("Car is servincing..");
	}
}
