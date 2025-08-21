package com.ait.day8.multithreading;

public class ExtendingThread extends Thread{
	public void run() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
//		Thread t1=new Thread();
		
		ExtendingThread e=new ExtendingThread();
		e.start();
	}
}