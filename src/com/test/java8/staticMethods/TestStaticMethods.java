package com.test.java8.staticMethods;

import java.util.ArrayList;
import java.util.List;

import com.test.java8.model.Person;

public class TestStaticMethods {

	public static void main(String[] args) {
		new TestStaticMethods().iterateCollection();

	}

	private void iterateCollection() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ram", 10));
		people.add(new Person("Ram Lubhaya", 60));
		people.add(new Person("Rahim", 20));
		
		people.forEach(p -> System.out.println(PersonInterface.display(p)));		
	}

}
