package com.test.java8.myClient;

public class TestRunnable {

	public static void main(String[] str){
		/*Runnable runnable1 = new Runnable (){
			public void run(){
				System.out.println("Output from thread 1");
			}
		};
		
		Runnable runnable2 = new Runnable (){
			public void run(){
				System.out.println("Output from thread 2");
			}
		};*/
		
		Runnable runnable1 = () -> System.out.println("Output from thread 1");
		Runnable runnable2 = () -> System.out.println("Output from thread 2");
		
		new Thread(runnable1).start();
		new Thread(runnable2).start();
	}
}
