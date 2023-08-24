package com.java9.feature8;

import java.util.Optional;

public class ProceeHandleEx {

	public static void main(String[] args) {
		//how to get proccess handle of current running process
		
		ProcessHandle ph = ProcessHandle.current();
		System.out.println("Process Handle :  " + ph);
		
		// you can process information from specific process id
		Optional<ProcessHandle> phID = ProcessHandle.of(19500);
		System.out.println("Process ID : " + phID.get().info());
	}

}
