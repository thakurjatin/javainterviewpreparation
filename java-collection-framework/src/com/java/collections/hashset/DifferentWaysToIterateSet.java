package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {

	public static void main(String[] args) {
		
		Set<String> courses = new HashSet<String>();
		courses.add("Java");
		courses.add("C");
		courses.add("C++");
		courses.add("Python");
		courses.add(".Net");
		
		System.out.println(courses);

		// Enhanced For Loop
		
		for(String course : courses) {
			System.out.println(course);
		}
		// Basic loop with iterator
		
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String prog = (String) iterator.next();
			System.out.println(prog);
			
		}
		// while loop with iterator
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String coure = (String) iterator.next();
			System.out.println(coure);
			
		}
		
		// JDK 8 forEach() method with lamba
		
		courses.forEach(course -> System.out.println(course));
		
		// JDK 8 streaming + forEach() + lamba Expression
		
		courses.stream().filter(course -> !"Java".equals(course))
		.forEach(course -> System.out.println(course));
		
	}

}
