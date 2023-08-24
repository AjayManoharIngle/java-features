package com.java14.feature3;

public class Records {
	
	// bydefault record object final
	// inside record all are static varibale
	
	record User(String username, String password) {}
	
	record Student(String StuName, String className) {
		static String courseName = "CS";
	}

	public static void main(String[] args) {
		
		User user = new User("ingleajay","Pass@123");
		System.out.println("Username  : " + user.username);
		System.out.println("Password : " + user.password);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		OutsideRecord.Person person = new OutsideRecord.Person("ajay","ingle");
		System.out.println("First Name : " + person.firstName());
		System.out.println("Last Name : " + person.lastName());
		
		// check can we change data of record object
		// user.password = "Pass@1234"; ===> error
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		Student student = new Student("Ajay", "A");
		System.out.println("Student Course Name : " + student.courseName);
		System.out.println("Student Name : "+ student.StuName);
		System.out.println("Studnet in " + student.className);
		
		// Check equals on two clases
		System.out.println(student.equals(person));
		
		// hashcode 
		System.out.println(student.hashCode());
	}

}
