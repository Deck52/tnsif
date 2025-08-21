package com.ait.day10.Strings;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4="sachin";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s4));
	}
}
