package com.test.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import com.test.java8.model.Person;

public class FilteringAndAggregation {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Ram", 10));
		people.add(new Person("Rahim", 20));
		people.add(new Person("Ram Lubhaya", 60));
		
		//count
		
		System.out.println("total Count" + people.stream().count());
		//Filtering
		Predicate<Person> adults = p -> p.getAge() > 18;
		people.stream().filter(adults).forEach(p -> System.out.println(p));
		
		//display single element from complex object
		people.stream().mapToInt(p -> p.getAge()).forEach(p -> System.out.println(p));
		
		//Sum of single primitive value from complex object
		int sum = people.stream().mapToInt(p -> p.getAge()).sum();
		System.out.println("SUM " +  sum);
		
		//Average (because we can have divide by zero problem hence it will return OptionalDouble)
		OptionalDouble optionalDouble =  people.stream().mapToInt(p -> p.getAge()).average();
		if(optionalDouble.isPresent()){
			System.out.println("Value Present " +  optionalDouble.getAsDouble());
		}else{
			System.out.println("Value NOT Present " );
		}
		
		
	}
}
