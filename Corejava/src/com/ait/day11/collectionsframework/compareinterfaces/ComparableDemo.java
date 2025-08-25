package com.ait.day11.collectionsframework.compareinterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<>();
		
		p.add(new Person("John",20));
		p.add(new Person("Emad",79));
		p.add(new Person("Vishal",16));
		
		Collections.sort(p);
		for(Person a:p) {
			a.displayinfo();
		}

	}

}
