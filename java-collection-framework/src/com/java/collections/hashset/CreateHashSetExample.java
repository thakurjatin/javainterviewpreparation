package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {

		// create hashset using HashSet() constructor
		// add new element to it using the add() method
		
		
		//unordered collection, contain no duplicate value if try will replace previous one.
		Set<String> programmingLanguage = new HashSet<String>();
		programmingLanguage.add("C");
		programmingLanguage.add("Java");
		programmingLanguage.add("Python");
		programmingLanguage.add("C++");
		programmingLanguage.add(".Net");
		programmingLanguage.add("JS");
		
		System.out.println(programmingLanguage);
		
		// add duplicate element
		programmingLanguage.add(".Net");
		System.out.println(programmingLanguage);
		System.out.println(programmingLanguage.size());
		if(programmingLanguage.contains("Java")) {
			System.out.println("Yes");
		}
		programmingLanguage.remove("C");
		System.out.println(programmingLanguage);
		System.out.println(programmingLanguage.isEmpty());
		
		// add(), contains(),remove(), isEmpty(),size(),clear()
		
	}

}
