package com.test.java8.stream;

import java.util.ArrayList;
import java.util.List;

import com.test.java8.model.Person;

public class TraverseCollection {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ram", 10));
		people.add(new Person("Rahim", 20));
		people.add(new Person("Ram Lubhaya", 60));
		
		people.stream().forEach(p -> System.out.println(p));

	}

}
