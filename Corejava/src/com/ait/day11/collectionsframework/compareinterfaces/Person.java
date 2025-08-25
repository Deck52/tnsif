package com.ait.day11.collectionsframework.compareinterfaces;

public class Person implements Comparable<Person> {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void displayinfo() {
		System.out.println("name:"+name+"\nage:"+age);
	}
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
		
	}
}
