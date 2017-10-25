package com.test.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.test.java8.model.Person;

/**
 * Predicate represents a boolean condition that you can take out and pass to a function which can use it.
 * This is helpful in scenarios where most of the code is same but a condition differs. traditional mechanism
 * of coding will create code duplication
 * @author agu133
 *
 */
public class TestPredicate {

	public static void main(String str[]){
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ram", 10));
		people.add(new Person("Rahim", 20));
		people.add(new Person("Ram Lubhaya", 60));
		
		Predicate<Person> young = (p) -> p.getAge() < 18;
		Predicate<Person> adult = p -> p.getAge() >= 18;
		Predicate<Person> old = p -> p.getAge() >= 60;
		
		displayRequested(people, young);
		displayRequested(people, adult);
		removeRequested(people, old);
		displayRequested(people, adult);
		
	}
	
	/*private static void displayRequested(List<Person> people, Predicate<Person> predicate){
		for (Person person : people) {
			if(predicate.test(person)){
				System.out.println(person);
			}
		}
	}
	*/
	private static void displayRequested(List<Person> people, Predicate<Person> predicate){
		people.forEach(p -> {
			if(predicate.test(p)){
				System.out.println(p);
			}
		});
	}
	
	private static void removeRequested(List<Person> people, Predicate<Person> predicate){
		if(people.removeIf(predicate)){
			System.out.println("Removed Person " );
		}
	}
}

