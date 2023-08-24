package com.java16.feature2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListMethod {

	public static void main(String[] args) {
		
		List<String> integersAsString = Arrays.asList("1", "2", "3");
		List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
	
		System.out.println(ints);
		System.out.println(intsEquivalent);
	}

}
