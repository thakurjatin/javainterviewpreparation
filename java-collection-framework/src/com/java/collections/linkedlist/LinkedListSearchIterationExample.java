package com.java.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListSearchIterationExample {

	public static void main(String[] args) {

		LinkedList<String> progLang = new LinkedList<String>();
		progLang.add("C");
		progLang.add("Java");
		progLang.add("C++");
		progLang.add(".Net");
		progLang.add("Python");
		
		System.out.println(progLang);
		System.out.println(progLang.contains("C"));
		
		System.out.println(progLang.indexOf("Java"));
		
		System.out.println(progLang.lastIndexOf(".Net"));
		
		//iterator
		 Iterator<String> iterator = progLang.iterator();
		 while (iterator.hasNext()) {
			String prog = (String) iterator.next();
			System.out.println(prog);	
		}
		
		// for Each
		 
		 progLang.forEach(element -> {
			 System.out.println(element);
		 });
		// for Each advance loop
		 
		 for(String e: progLang) {
			 System.out.println(e);
		 }
		// simple for loop
		
		 
	}

}
