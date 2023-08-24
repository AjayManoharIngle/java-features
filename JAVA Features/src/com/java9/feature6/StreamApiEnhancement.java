package com.java9.feature6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEnhancement {

	public static void main(String[] args) {
		
		// this two are default methods in java 9
		takeWhile();
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		dropwhile();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		// this two are static methods in java 9
		streamIterate();
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		streamofNullable();
	}

	private static void streamofNullable() {
		// to avoid checking null everytime and avoid Null Pointer exception
		Stream.ofNullable("ajay").forEach(p -> System.out.println(p));
		Stream.ofNullable(null).collect(Collectors.toList());
	}

	private static void streamIterate() {
		// in java 8 : we have 2 arguments : [intial value,opeartion]
		// it can lead to infinite loop
		//Stream.iterate(1,p->p+1).forEach(k -> System.out.println(k));
		
		// to avoid infinite loop java 9 provides 3 arguments
		Stream.iterate(2,p->p<=4,r->r+2).forEach(j -> System.out.println(j));;
	}

	private static void dropwhile() {
		// it will drop elements if condition is statsfied and 
		//take element from that point to till end of stream
		
		// // Ex. find even element 
		// use filter
		List<Integer> list = Arrays.asList(3,2,4,5,6);
		List<Integer> newList = list.stream().filter(i -> i%2 == 0).toList();
		System.out.println(newList);
				
		// use dropwhile
		List<Integer> otherList = list.stream().dropWhile(i -> i%2 ==0).toList();
		System.out.println(otherList);
	}

	private static void takeWhile() {
		
		// it will process elemnets till condition is statsify
		// filter methods : process each element in stream 
		
		// // Ex. find even element 
		// use filter
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		List<Integer> newList = list.stream().filter(i -> i%2 == 0).toList();
		System.out.println(newList);
		
		// use takewhile
		List<Integer> otherList = list.stream().takeWhile(i -> i%2 ==0).toList();
		System.out.println(otherList);
	}
}
