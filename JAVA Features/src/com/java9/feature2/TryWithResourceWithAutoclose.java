package com.java9.feature2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TryWithResourceWithAutoclose {

	public static void main(String[] args) throws Exception {
		
		java6feature();
		java7feature();
		java9feature();
	}

	private static void java9feature() {
		// here you can handle multiple resources but you can write before 
		// try also so that you can use 
		
		MyResource mr1 = new MyResource();
		MyResource mr2 = new MyResource();
		MyResource mr3 = new MyResource();
		MyResource mr4 = new MyResource();
		
		try(mr1;mr2;mr3;mr4){
			mr1.process();
			mr2.process();
			mr3.process();
			mr4.process();

		}
		catch (Exception e) {System.out.println(e);}
	}

	private static void java7feature() {
		// here you can add muliple resource in try 
		try(MyResource mr = new MyResource();
			BufferedInputStream br = new BufferedInputStream(new FileInputStream("fjjf"))){
			mr.process();
		}
		catch(Exception e) {};
	}

	private static void java6feature() throws Exception {
		MyResource mr = new MyResource();
		try {
			mr = new MyResource();
			mr.process();
		}
		catch (Exception e) {}
		finally {
			if(mr != null) {
				mr.close();
			}
		}
	}
	
}
