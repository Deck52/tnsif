package com.ait.day11.collectionsframework.compareinterfaces;

public class College {
	String name;
	int age;
	public College(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void displayinfo() {
		System.out.println("Name:"+name+"\nage:"+age);
	}
}
