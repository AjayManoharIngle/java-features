package com.java9.feature4;

import java.util.Arrays;

// till 1.4 -  for new requirement we have to write new function
// till 1.5 - we can add no of arguments : 

public class SafeVarArgument {

	public static void main(String[] args) {
		
		 int[] numbers1 = java5feature(10,20,30);
		 int[] numbers2 = java5feature(10,20);
		 int[] numbers3 = java5feature();
		 System.out.println(Arrays.toString(numbers1));
		 System.out.println(Arrays.toString(numbers2));
		 System.out.println(Arrays.toString(numbers3));
	}

	// var-args converted into internally to array = 
	// unlimited no of arguments allowed
	private static int[] java5feature(int...var) {
		return var;
	}
}
