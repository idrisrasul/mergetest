package org.cont.test;

public class ConstructiClass {
	
	public ConstructiClass() {
		System.out.println("my default constructor");
	}
	
	public ConstructiClass(int a) {
		System.out.println("my parameterised cons with int data type");
	}
	
	public static void me() {
		System.out.println("my first purchase");
	}
	
	public static void me(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
//		me();
//		me(10);
		ConstructiClass c1 = new ConstructiClass();
		ConstructiClass c = new ConstructiClass(10);
		c.me();
		c.me(10);
	}
}
