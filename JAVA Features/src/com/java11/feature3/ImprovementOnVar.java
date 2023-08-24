package com.java11.feature3;

interface function{
	int sum(int a, int b);
}

public class ImprovementOnVar {

	public static void main(String[] args) {
		
		// var supports lambda expression
		
		// compuslory to put var on both argument don't skip and mismath type
		function p = (var a,var b) -> {return a+b;};
		
		System.out.println(p.sum(10,20));
		
		// you can mismatch like one var and second is string = not allowed
		// compuslory to give brackets when use var
	}

}
