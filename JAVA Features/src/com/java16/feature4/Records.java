package com.java16.feature4;

public class Records {
	
	// records avaiable inside class in class
	
	public record Book(String title, String author, String isbn) {
	}
	
	class Student{
		Book book = new Book("ajay","fhfh","fhfhfh");
	}

	public static void main(String[] args) {
		
		Student stu = new Records().new Student();
		System.out.println(stu.book);
	}

}
