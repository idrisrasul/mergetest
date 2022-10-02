package org.may.string;

public class StringCLass {

	
	static void hascode(){
		String s = "shahul hamhhd";
		int indexOf = s.indexOf('h');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('h');
		System.out.println(lastIndexOf);
	}
		
		
		
//		String substring = s.substring(2);
//		System.out.println(substring);
//		 
//		String substring2 = s.substring(2, 5);
//		System.out.println(substring2);
//		String s = "shahul";
//		String upperCase = s.toUpperCase();
//		String lowerCase = s.toLowerCase();
//		System.out.println(upperCase+ lowerCase);
		
//		for (int i = 0; i < s.length(); i++) {
//			if(i%2==0) {
//			System.out.println(s.charAt(i));
//			}
//		}

		public void gittask() {
			String s="idris mohammed";
			for (int i = 0; i < s.length(); i++) {
				if(i%2==0) {
				System.out.println(s.charAt(i));
				}
		}
	}
	
	public static void main(String[] args) {
		hascode();
	}
}
