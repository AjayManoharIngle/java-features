package com.java10.feature1;

import java.util.function.Consumer;

public class LimitionOfVar {
	
	//1. var x = 10; // instance var is not allowed with var
	//2. static var f = 10; // static var is not allowed with var 
	//5. var i; // var not allowed without intializer

	public static void main(String[] args) {
		
		// This is for local variable only, not for memeber , instance , parameter , return type etc.
		
		//3. method1(10,"ajay"); // this not allowed with method 
		//4. method1(20); // this not allowed as return type for method
		
		//6. var p = null; // var can not assign null values
		//7. error: lambda expression needs an explicit target-type
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    // var m = (n) -> { System.out.println(n); };
	    
	    //8.error: array initializer needs an explicit target-type
	    int[] p = {1,2,3,4};
	    // var q = {2,3,34};
	}

//	private static var method1(int i) {
//		return i;
//	}

//	private static void method1(var i, var string) {
//		System.out.println(i + " " + string);
//	}
}
