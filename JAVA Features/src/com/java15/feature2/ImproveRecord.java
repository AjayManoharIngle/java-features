package com.java15.feature2;

public class ImproveRecord {

	//While records eliminate a lot of boilerplate code
	//It's worth mentioning that records do have some restrictions. 
	//Among other things, they are always final, 
	//they cannot be declared abstract, and they can't use native methods.
	
	record Student(String StuName, String className) {
		public Student {
			if(!StuName.equals("ajay")) {
				System.out.println("Student name is not equal");;
			}
		}
	}
	
	public static void main(String[] args) {
		Student stu = new Student("vijay", "B");
		System.out.println("Current student details : " + stu.StuName + " " + stu.className);
	}
}
