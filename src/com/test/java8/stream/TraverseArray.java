package com.test.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

import com.test.java8.model.Person;

public class TraverseArray {

	public static void main(String[] args) {
		Person[] people = {
		new Person("Ram", 10),
		new Person("Rahim", 20),
		new Person("Ram Lubhaya", 60)};
		
		Stream<Person> personStream = Stream.of(people);
		display(personStream);
		
		//Another way
		personStream = Arrays.stream(people);
		display(personStream);

	}
	
	private static void display(Stream<Person> personStream){
		personStream.forEach(p -> System.out.println(p));
	}
}
