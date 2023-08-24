package com.java11.feature2;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		
		// we can easily convert into array type
		//it is taking intFunction inside
		
		List<Integer> list  = Arrays.asList(1,2,3,3,30);
		Integer[] arrayList = list.toArray(Integer[]::new);
		System.out.println(Arrays.toString(arrayList));
		System.out.println(arrayList[2]);
		
		
	}

}
