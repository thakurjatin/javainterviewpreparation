package com.java.collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateList {
	
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("C", "C++", "Java", "Python", "C#");
		
		//basic for loops
		for(int i = 0; i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		// Enhanced for each loop
		
		for(String course: courses) {
			System.out.println(course);
		}
		
		// basic loop with iterator
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
			
		}
		
		courses.stream().forEach(course -> System.out.println(course));
	}
}
