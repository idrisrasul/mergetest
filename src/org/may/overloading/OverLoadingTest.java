package org.may.overloading;

import java.util.Scanner;

public class OverLoadingTest {
	
	public void truck() {
		int a;
		a=20;
		System.out.println("am going to load cotton box");
	}
	
	public void truck(int a) {
		a=30;
		System.out.println("am going to load leather goods : " + a);
	}
	
	public void truck(int a ,String b) {
		System.out.println("am going to load leather and cotton goods : " + a + b);
	}
	
	public void truck(String a ,int b) {
		System.out.println("am going to load leather goods : " + a);
	}
	
	public static void main(String[] args) {
		OverLoadingTest overLoadingTest = new OverLoadingTest();
		Scanner sc = new Scanner(System.in);
		overLoadingTest.truck();
		overLoadingTest.truck(sc.nextInt());
		overLoadingTest.truck(sc.nextInt(), sc.next());
		overLoadingTest.truck(sc.next(), sc.nextInt());
		
	}

}
