package com.dp.singleton;

public class Client {
	
	private static SingletonDemo singletonDemo;
	
	public static void main(String[] args) {
		try {
			singletonDemo = SingletonDemo.getInstance();
			System.out.println(singletonDemo.getMessage()); ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
