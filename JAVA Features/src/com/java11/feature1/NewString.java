package com.java11.feature1;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewString {
	
	//Java 11 adds a few new methods to the String class: 
	//isBlank, lines, strip, stripLeading, stripTrailing, and repeat.

	public static void main(String[] args) {
		
		String str = "Codeouter helps \n \n developers \n explore Java.";
		
		// isBank()
		System.out.println(str.isBlank());
		System.out.println("".isBlank());
		System.out.println(" ".isBlank());
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
		// lines()
		System.out.println(str.lines().collect(Collectors.toList()));
		str.lines().filter(s->s.isBlank()).map(p->p.concat("j")).forEach(s -> System.out.println(s));

		//strip => remove white spaces
		System.out.println("     aj ll ll       ".strip());
		
		// strip leading and trailing
		System.out.println("     aj ll ll       ".stripLeading());
		System.out.println("     aj ll ll       ".stripTrailing());
		
		// strip indent -> remove white space from begin and end
		System.out.println("""
				Ajay Ingle
				Vijay Ingle
				""".stripIndent());


		// repeat 
		System.out.println("Ajay is best \n".repeat(3));
	}
}
