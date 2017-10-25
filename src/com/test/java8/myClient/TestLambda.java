package com.test.java8.myClient;

import com.test.java8.myFunctionalInterface.FunctionalInterface1;
import com.test.java8.myFunctionalInterface.FunctionalInterfaceWithArgs;

public class TestLambda {

	public static void main(String[] str){
		
		// Test functional Interface without arguments
		FunctionalInterface1 myObj = () -> System.out.println("Hello Lambda");
		myObj.doSomething();
		
		//Test Functional Interface with arguments
		FunctionalInterfaceWithArgs functionalInterfaceWithArgs = (num1, num2) ->{
			int value = num1 + num2;
			System.out.println("The value is " + value);
		};
		functionalInterfaceWithArgs.doSomethingWithArgs(2, 3);
	}
}
