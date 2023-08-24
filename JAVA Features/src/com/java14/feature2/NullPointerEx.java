package com.java14.feature2;

public class NullPointerEx {

	public static void main(String[] args) {
		int[] arr = null;
		arr[0] = 1;
		
		System.out.println(arr[0]);
		
//		Earlier, on running this code, the log would say:
//
//			Exception in thread "main" java.lang.NullPointerException
//			at com.baeldung.MyClass.main(MyClass.java:27)
	}
}
