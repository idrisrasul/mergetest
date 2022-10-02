package org.cont.test;

public class chainCont {
	
	private String name;
	private int age;

	public chainCont() {
		this(10);//chainCont c = new chainCont(10);
		System.out.println("my default constru");
	}
	
	public chainCont(int a) {
		this("shahul");//chainCont c = new chainCont("shahul");
		this.age=a;
		System.out.println("my int constru");
	}
	
	public chainCont(String a) {
		this.name=a;
		System.out.println("my String constru");
	}
	
	public static void main(String[] args) {
		chainCont c = new chainCont();
		System.out.println(c.age);
		System.out.println(c.name);
	}
	

}
