package com.test.java8.staticMethods;

import com.test.java8.model.Person;

public interface PersonInterface {
/*	
	String getName();
	
	int getAge();
*/
	static String display(Person p){
		return p.getName() + "[" + p.getAge() + "]";
	}
}
