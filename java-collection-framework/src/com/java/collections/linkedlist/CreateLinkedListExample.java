package com.java.collections.linkedlist;

import java.util.LinkedList;

//add()
//add(2,element)
//addFirst()
//addLast()
public class CreateLinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("oranges");
		fruits.add("watermelon");
		
		System.out.println(fruits);
		
		// add at specific loction
		
		fruits.add(2, "chiku");
		System.out.println(fruits);
		
		fruits.addFirst("Strawberry");
		System.out.println(fruits);
		
		fruits.addLast("banana");
		System.out.println(fruits);

		
	}

}
