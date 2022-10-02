package org.collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class setmethod {

	
	
	public static void main(String[] args) {
		int[] a = {10,20,30,10,10};
		
		int count =0;int count20=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (10==a[j]) {
					count =count+1;
				}
				else if(20==a[j]) {
					
				}
			}
		}
		System.out.println(count);
		
		
		
	}
}
