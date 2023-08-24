package com.java9.feature5;

import java.util.Arrays;
import java.util.List;

public class DiffArraysAndListOf {

	public static void main(String[] args) {
		
		// replace element at specific index
		// Arrays.asList is return mutable list while List.of return is immutable
	
		setValue(); // unspupportException
		setNullValue(); // NullPointer exception
	}

	private static void setNullValue() {
		List<Integer> list = Arrays.asList(1,2,3,4,null);
		System.out.println("Arrays.asList : " + list);
		
		//List<Integer> alist = List.of(1,2,3,null);
		//alist.set(1, 200);
		System.out.println("List.of : can't have null values ");
	}

	private static void setValue() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.set(1,100);
		System.out.println("Arrays.asList : " + list);
		
		List<Integer> alist = List.of(1,2,3,4);
		//alist.set(1, 200);
		System.out.println("List.of : " + alist);
	}

}
