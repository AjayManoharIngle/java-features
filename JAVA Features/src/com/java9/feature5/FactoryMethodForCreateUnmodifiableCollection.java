package com.java9.feature5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactoryMethodForCreateUnmodifiableCollection {

	// factory method for creating unmodifiable collection
	// till 1.8 - we can normal collection in which we can after created
	// object we can remove and add objects in it and we can also
	// create unmodifiable collection but code length increases.
	
	
	public static void main(String[] args) {
		
		java8();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		java9();
	}

	private static void java9() {
		List<Integer> list = List.of(1,2,3,7);
		System.out.println("Unmodifiable collection created  : " + list);
		//list.remove(1);
		System.out.println("You can't remove ele");
	}

	private static void java8() {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		System.out.println("Create List : " + list);
		
		// remove element 
		list.remove(2);
		
		System.out.println("Before unmodifiable list remove ele: " + list);
		
		// make collection to be unmodifiable
		list = Collections.unmodifiableList(list);
		
		System.out.println("List is now unmodifiable : "  + list);
		
		// after make list as immutable you can't do other activites
		// Get unsupportopeartions exception
		//list.remove(1);
		System.out.println("Get unsupport exception while remove ele");
	}
}
