package com.test.java8.model;

import com.test.java8.staticMethods.PersonInterface;

public class Person implements PersonInterface{
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return name + "[" + age + "]";
	}
	
	public static int sortYoungToOld(Person first, Person second){
		Integer one = first.getAge();
		return one.compareTo(second.getAge());
	}
}
