package com.java9.feature3;

import java.util.ArrayList;

public class DiomandOpeator {
	
	/* 
Till 1.4 - we have collection in which there is no type safety and type casting use.

ArryaList arr = new ArryList(); ⇒ type safe & type cast not possible

Till 1.5 - we have generics concept.

ArrayList<String> arr = new ArrayList<String>();

⇒ it is type safe and no need to type cast objects.

Till 1.7 - we don’t need any type in declaration part

ArrayList<String> arr = new ArrayList<>();

Till 1.9 - you can do operations with anonymous classes.

ArrayList<String> arr = new ArrayList<>(){
	operations…..
}
*/
	public static void main(String[] args) {
		ArrayList<Integer> no = new ArrayList<>(){
			@Override
			public boolean isEmpty() {
				return super.isEmpty();
			}
		};
		no.add(2);
		System.out.println(no.isEmpty());
	}

}
