package org.cont.test;

public class Parentclass {

	public Parentclass() {
		this(10);
		System.out.println("my default parent class constructor");
	}
	
	public Parentclass(int b) {
		System.out.println(b);
	}
}
