package org.may.scanner;

import java.util.Scanner;

public class ScannerTest {
	
	public void carrot() {
		Scanner sc = new Scanner(System.in);
		float carrot_Price = sc.nextFloat();
		float qty = sc.nextFloat();
		float total_price= carrot_Price * qty;
		System.out.println("Carrot per kg   Qty    Total price");
		System.out.println(carrot_Price+ "   "+qty +"  " + total_price);
	}
	
	
	
	public void biscuit() {
		Scanner sc= new Scanner(System.in);
		int biscuit = sc.nextInt();
		int qty = sc.nextInt();
		int totalPrice= biscuit*qty;
		System.out.println(totalPrice);
	}
	
	public void billing() {
		Scanner sc= new Scanner(System.in);
//		String customerName= sc.next();
//		System.out.println(customerName);
		String customerName= sc.nextLine();
		System.out.println(customerName);
		String paymentMode= sc.next();
		System.out.println("Payment mode : "+ paymentMode);
	}
public static void main(String[] args) {
	ScannerTest scannerTest = new ScannerTest();
	scannerTest.billing();
}
	
}
