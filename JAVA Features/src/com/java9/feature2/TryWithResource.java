package com.java9.feature2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException{
		oldWay();
		newWay();
	}

	private static void newWay() {
		// onwards 1.7 we no need to write any close inside finally block.
		try(BufferedInputStream br = new BufferedInputStream(new FileInputStream("filename"))){
			// perform opeartions
		}
		catch (Exception e) {}
	}

	private static void oldWay() throws IOException {
		// till 1.6 we have to close db, file connection manully using 
		// finally with try-catch
		
		// increase complexity and increases length of code 
		BufferedInputStream br = null;
		try {
			br = new BufferedInputStream(new FileInputStream("filename"));
			// perform other things
		}
		catch(Exception e) {}
		finally {
			if(br != null) {
				br.close();
			}
		}
	}

}
