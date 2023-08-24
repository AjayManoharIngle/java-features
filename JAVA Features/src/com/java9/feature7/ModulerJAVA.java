package com.java9.feature7;

import java.sql.Connection;
import java.util.ArrayList;

public class ModulerJAVA {

	public static void main(String[] args) {
		
		// identitfy class present in which module
		
		System.out.println(String.class.getModule());
		System.out.println(ArrayList.class.getModule());
		System.out.println(Connection.class.getModule());
	}

}
