package org.may.java;

import org.may.java2.*;

public class DayOneClass {
	
	//{}- flower bracket - is used to right more then one line of code
	//()- funtional bracket - its used to declare input type / to create a method
	public void pen()	{
		System.out.println("This is my first Pen");
	}
	
	
	public void penTwo() {
		System.out.println("This is my second Pen");
	}
	
	public static void main(String[] args) {
		boolean s = true;
		String key = String.valueOf(s);
	//		String key ="true";
			switch (key) {
			case "true":
				int a=10;
				int b=20; 
				System.out.println(a+b);
				break;
			case "false":
				int as=10;
				int bs=20; 
				System.out.println(as-bs);
				break;
	
			default:
				System.out.println("the given key is not present in the below case");
				break;
			}
}
}
