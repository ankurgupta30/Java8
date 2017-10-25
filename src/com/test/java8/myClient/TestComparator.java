package com.test.java8.myClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * This class sorts a list using functional interface Comparator
 * @author agu133
 *
 */
public class TestComparator {

	public static void main(String[] str){
		List<String> myList = new ArrayList();
		myList.add("AAAA");
		myList.add("bbbb");
		myList.add("CCCC");
		myList.add("dddd");
		myList.add("EEEE");
		
/*		Collections.sort(myList,new Comparator<String>(){
			public int compare(String str1,String str2){
				return str1.compareToIgnoreCase(str2);
			}
		});*/
		
		Comparator<String> comparator = (str1,str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		
		Collections.sort(myList,comparator);
		System.out.println("Sorted : " + myList);
	}
}
