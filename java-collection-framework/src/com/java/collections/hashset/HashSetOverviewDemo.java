package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;


public class HashSetOverviewDemo {

	public static void main(String[] args) {
		
		//check duplicate element
		Set<String> set = new HashSet<String>();
		set.add("element1");
		set.add("element1");
		System.out.println(set.toString());
		
		// unorded collection
		set.add("element1");
		set.add("element2");
		set.add("element3");
		set.add("element40");
		set.add("element5");
		set.add("element6");
		System.out.println(set.toString());
		
	}
	

}
