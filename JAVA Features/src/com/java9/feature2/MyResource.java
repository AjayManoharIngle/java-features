package com.java9.feature2;

class MyResource implements AutoCloseable{
	
	public MyResource() {
		System.out.println("Myresource constructor....");
	}
	
	public  void process() {
		System.out.println("Doing process....");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Resource closing...");
	}
	
}