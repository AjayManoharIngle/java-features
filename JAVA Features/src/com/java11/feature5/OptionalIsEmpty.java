package com.java11.feature5;

import java.util.Optional;

public class OptionalIsEmpty {

	public static void main(String[] args) {
		
		// Object is empty or not
		// if object is empty then only it is true otherwise false
		
		Optional<String> str = Optional.of(" ");
		str=str.empty();
		System.out.println("Check strin is empty : " + str.isEmpty());
	}
}
