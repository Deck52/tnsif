package com.ait.day11.collectionsframework.compareinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<College> p=new ArrayList<>();
		
		p.add(new College("John",20));
		p.add(new College("Emad",79));
		p.add(new College("Vishal",16));
		
		Collections.sort(p,new NameComp());
		System.out.println("Sorted by Name:\n");
		for(College c:p) {
			c.displayinfo();
		}
		System.out.println();
		Collections.sort(p,new AgeComp());
		System.out.println("Sorted by Age:\n");
		for(College c:p) {
			c.displayinfo();
		}
		

	}

}
