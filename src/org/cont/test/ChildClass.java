package org.cont.test;

public class ChildClass extends Parentclass{

	public void meth() {
		int a =20;
		System.out.println(a);
		
		int[] a1 = {10,20,30,40,50,78,76,98};
		System.out.println(a1[a1.length-1]);
		
		System.out.println(a1.length);
		
		/*
		 * 1. to print all data from an array,collection
		 * 2. if we are going to do the same work with different input
		 * we will use looping concept
		 * 3. if we have more one data to be printed then we use looping cncept
		 */
		
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		
	}
	
	public void sizedata() {
		int[] a= new int[5];
		a[0]=20;
		a[1]=10;
		a[2]=30;
		a[4]=50;
		System.out.println(a[2]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}
	
	public ChildClass(int a) {
		System.out.println("child parameter const");
	}
	
	public void twodinmen() {
		int[][] a= new int[3][2];
		a[0][0] = 10;
		a[0][1]=20;
		a[1][0] = 30;
		a[1][1]=40;
		a[2][0] = 50;
		a[2][1]=60;
		
		System.out.println(a[2][1]);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	
	public void twodimValue() {
		int[][] a = {{10,20},{30,40},{50,60}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		ChildClass c = new ChildClass(10);
		c.twodimValue();
	}
	
}
