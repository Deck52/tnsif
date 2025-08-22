package com.ait.day11.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Apple");
		a.add(5);
		a.add(78.5f);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(5));
		System.out.println(a.isEmpty());
		System.out.println(a.get(2));
		
		Iterator itr=a.iterator();
		

	}

}
