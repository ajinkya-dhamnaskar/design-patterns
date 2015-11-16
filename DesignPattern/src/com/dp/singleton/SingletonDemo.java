package com.dp.singleton;

public class SingletonDemo {
	
	volatile private static SingletonDemo singletonDemo;
	
	private SingletonDemo() throws Exception{
		if(singletonDemo != null){
			throw new Exception();
		}
	}
	
	public static SingletonDemo getInstance() throws Exception{
		if(singletonDemo == null){
			synchronized(SingletonDemo.class) {
				if(singletonDemo == null){
					singletonDemo = new SingletonDemo();
				}
			}
		}
		return singletonDemo;
	}
	
	public String getMessage(){
		return "hello";
	}
}
