package com.ait.day11.collectionsframework.compareinterfaces;

import java.util.Comparator;

public class NameComp implements Comparator<College> {

	@Override
	public int compare(College o1, College o2) {
		
		return o1.name.compareTo(o2.name);
	}
}
