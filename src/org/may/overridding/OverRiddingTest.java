package org.may.overridding;

import org.may.overloading.OverLoadingTest;

public class OverRiddingTest extends OverLoadingTest{
	
	@Override
	public void truck(int a) {
		// TODO Auto-generated method stub
		super.truck(a);
		System.out.println("add cooton product in loading");
	}
	
	@Override
	public void truck() {
		// TODO Auto-generated method stub
//		super.truck();
		System.out.println("overrideded method");
	}
	
public static void main(String[] args) {
	OverRiddingTest overRide= new OverRiddingTest();
	overRide.truck(20);
	overRide.truck();
}
}
