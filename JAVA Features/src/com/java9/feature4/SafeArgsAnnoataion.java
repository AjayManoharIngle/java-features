package com.java9.feature4;

import java.util.Arrays;
import java.util.List;

public class SafeArgsAnnoataion {
	
	// if our method won't cause heap pollution then we can 
	// supress complier warnings with @SafeArgs annoation..
	// till 1.7 - use with constructor, static & final methods
	// till 1.9 - use with private method
	
	@SafeVarargs
	public SafeArgsAnnoataion(int...x ){
		System.out.println("Constructor is ongoing : " + x[0]);
	}

	public static void main(String[] args) {
		SafeArgsAnnoataion sf = new SafeArgsAnnoataion(1000);
		m1(Arrays.asList("ajay","vijay"));
		m2(Arrays.asList("ajay","vijay"));
	}

	@SafeVarargs
	private static void m1(List<String>... x) {
		for (List<String> list : x) {
			System.out.println("method is running  :" + list);
		}
	}
	
	@SafeVarargs
	private final static void m2(List<String>... x) {
		for (List<String> list : x) {
			System.out.println("method is running  :" + list);
		}
	}

}
