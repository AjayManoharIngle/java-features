package com.java10.feature2;

import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableCollection {
	
	// This is are new methods in java 10

	public static void main(String[] args) {
		copyOfCollection();
		streamSupportUnmodifiable();
	}

	private static void streamSupportUnmodifiable() {
		List<Integer> evenList = List.of(1,2,3,4,5).stream()
			      .filter(i -> i % 2 == 0)
			      .collect(Collectors.toUnmodifiableList());
		System.out.println(evenList);
		//evenList.add(4);
	}

	private static void copyOfCollection() {
		// copyOf(Collection) - return unmodifiable collection
		var list = List.of(1,2,3,4,5);
		System.out.println(list);
				 
		var copyList  = List.copyOf(list);
		//copyList.add(100);
		System.out.println(copyList);
	}
}
