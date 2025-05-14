package com.ait.pog6.anotherpackage;

import com.ait.pog6.Base;

public class Executor extends Base {

	public static void main(String[] args) {
		Executor b1=new Executor();
//		b1.varPrivate=89;
//		b1.varDefault=80;
		b1.varProtected=89;
		b1.varPublic=90;
		b1.methodProtected();
		b1.methodPublic();
	

	}

}
