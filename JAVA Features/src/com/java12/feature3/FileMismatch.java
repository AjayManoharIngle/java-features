package com.java12.feature3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatch {

	public static void main(String[] args) throws IOException {
	
		Path filePath1 = Files.createTempFile("file1", ".txt");
	    Path filePath2 = Files.createTempFile("file2", ".txt");
	    Files.writeString(filePath1, "Java 12 Article");
	    Files.writeString(filePath2, "Java 12 Article");

	    long mismatch1 = Files.mismatch(filePath1, filePath2);
	    System.out.println("File not mismatch : " + mismatch1);
	    
	    Files.writeString(filePath1, "Java 12 Blog");
	    Files.writeString(filePath2, "Java 12 Article");
	    
	    long mismatch2 = Files.mismatch(filePath1, filePath2);
	    System.out.println("File mismatch : " + mismatch2);
	}
}
