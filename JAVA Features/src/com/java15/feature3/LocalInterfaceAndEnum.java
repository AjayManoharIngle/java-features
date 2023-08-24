package com.java15.feature3;

import java.util.Iterator;

public class LocalInterfaceAndEnum {

	// we can use class as local inside class
	// java 15 onwards, interface,records and enum can be used inside locally
	
	
	public static void main(String[] args) {
		
		class Person{
			int id = 101;
		}
		
		Person p = new Person();
		System.out.println(p.id);
		
		// interface locally
		
		interface cal{
			int sum(int a, int b);
		}
		
		cal c = (a,b)->a+b;
		System.out.println(c.sum(10,20));
		
		// enum in locally
		
		enum no {one,two,three,four};
		
		for(no i : no.values()) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		// records in locally
		
		record student() {static int studId = 102;}
		
		student s = new student();
		System.out.println(s.studId);
	}
}
