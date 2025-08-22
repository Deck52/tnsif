package com.ait.day11.collectionsframework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> s=new LinkedList<String>();
		System.out.println("Intial list of elem "+s);
		s.add("Raheem");
		s.add("Roopa");
		s.add("Roshan");
		s.add("Rahul");
		System.out.println("List of Elements "+s);
		s.add(1, "Reema");
		System.out.println(s);
		s.remove(1);
		s.addFirst("Pavan");
		s.addLast("Zora");
		System.out.println(s);
		

	}

}
