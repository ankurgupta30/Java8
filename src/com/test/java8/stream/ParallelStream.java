package com.test.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	public static void main(String[] str){
		List<String> testStrings =  new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			testStrings.add("Test" + i);
		}
		
		// Serial Streams
		//testStrings.stream().forEach(p ->  System.out.println(p));
		
		//Parallel Stream
		testStrings.stream().parallel().forEach(p ->  System.out.println(p));
	}
}
