package com.test.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.test.java8.model.Person;

/*Instead of using
AN ANONYMOUS CLASS
you can use
A LAMBDA EXPRESSION
And if this just calls one method, you can use
A METHOD REFERENCE

So to use a method reference, you first need a lambda expression with one method. And to use a lambda expression, you first need a functional interface, an interface with just one abstract method.
https://www.codementor.io/eh3rrera/using-java-8-method-reference-du10866vx
*/
public class TestMethodReference {

	public static void main(String[] args) {
		new TestMethodReference().iterateCollection();

	}

	private void iterateCollection() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ram", 10));
		people.add(new Person("Ram Lubhaya", 60));
		people.add(new Person("Rahim", 20));
		
		Collections.sort(people, this :: sortOldToYoung);
		display(people);
		Collections.sort(people, Person :: sortYoungToOld);
		display(people);
		
		
		TestMethodReference anotherInstance = new TestMethodReference();
		Collections.sort(people, anotherInstance :: sortOldToYoung);
		display(people);
		
	}

	private void display(List<Person> people) {
		people.forEach(p -> System.out.println(p));
		
	}


	private int sortOldToYoung(Person one, Person two){
		Integer person = two.getAge();
		return person.compareTo(one.getAge());
	}
}
