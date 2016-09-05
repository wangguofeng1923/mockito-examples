package com.wangguofeng1923.service;

public class DemoService {
	public String sayHello(String name){
		return "Hello,"+name;
	}
	public void printName(String name){
		System.out.println("username:"+name);
	}
	public boolean checkName(String name){
		if(name.equals("guofeng")){
			return true;
		}
		return false;
	}
}
