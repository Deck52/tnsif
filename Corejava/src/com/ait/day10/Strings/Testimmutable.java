package com.ait.day10.Strings;

public class Testimmutable {

	public static void main(String[] args) {
		String s1="Sachin";
		String s2=s1;
		String s3=s2;
		
		System.out.println("before modification:\ns1:"+s1+"\ns2:"+s2+"\ns3:"+s3);
		s1="Tendulkar";
		
		System.out.println("after modification:\ns1:"+s1+"\ns2:"+s2+"\ns3:"+s3);

	}

}
