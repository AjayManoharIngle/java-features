package com.java9.feature8;

import java.io.IOException;

public class ProcessBuilderEx {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// create own process 
		// open notepad 
		ProcessBuilder builder = new ProcessBuilder("notepad","C:\\Users\\Sonali\\Desktop\\Ajay\\features\\ModuleB\\src\\module-info.java");
		Process pb = builder.start();
		System.out.println("Wait for 5s..");
		Thread.sleep(5000);
		pb.destroy();
	}

}
