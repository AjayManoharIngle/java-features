package com.java10.feature3;

import java.util.Arrays;
import java.util.Optional;

public class OptionalOrElseThrow {

	//java.util.Optional, java.util.OptionalDouble, java.util.OptionalIntand
	//java.util.OptionalLongeach got a new method orElseThrow()which 
	//doesn't take any argument 
	//and throws NoSuchElementExceptionif no value is present:
	
	public static void main(String[] args) {
		Optional<Integer> firstEven = Optional.ofNullable(Arrays.asList(11,23,39).stream()
			      .filter(i -> i % 2 == 0)
			      .findFirst()
			      .orElseThrow());
		System.out.println(firstEven.get());
	}
}
