package com.java10.feature1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVariableInference {

	public static void main(String[] args) {
		
		// var is keyword which used for local variables and complie infere to target data type
		
		int x = 10;
		var y = 10;
		System.out.println(y);
		
		Map<Integer,List<Integer>> map = new HashMap<>();
		
		var mapList = new HashMap<>();
		// if write above it will take by default key , value as object and object
		System.out.println(mapList instanceof HashMap<Object, Object>);
		
		var mapList1 = new HashMap<Integer,List<Integer>>();
		System.out.println(mapList1 instanceof HashMap<Integer, List<Integer>>);
	}

}
