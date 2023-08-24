package pack1;

import moduleA.Sum;

public class GetSum {
	
	// B --> require module A --> required module C
	// B can be get directly module C

	public static void main(String[] args) {
		System.out.println("Get Sum from module B : " + Sum.add(10,30,2));
		System.out.println("Multiplcation from module C : " + Sum.multObj().mult(10,20));
	}
}
