package com.ait.day11.collectionsframework.compareinterfaces;

import java.util.Comparator;

public class AgeComp implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
}
