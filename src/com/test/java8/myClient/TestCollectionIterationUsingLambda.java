package com.test.java8.myClient;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionIterationUsingLambda {

	public static void main(String[] str){
		List<String> myList = new ArrayList();
		myList.add("AAAA");
		myList.add("bbbb");
		myList.add("CCCC");
		myList.add("dddd");
		myList.add("EEEE");
		//Example of consumer interface which is a functional interface
		
		myList.forEach((str1) -> System.out.println(str1));
	}
}
