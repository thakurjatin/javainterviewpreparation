package com.java.collections.linkedlist;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

	public static void main(String[] args) {

		LinkedList<String> fruitList = new LinkedList<String>();
		fruitList.add("mango");
		fruitList.add("banana");
		fruitList.add("apple");
		fruitList.add("oranges");
		fruitList.add("watermelon");
		
		System.out.println(fruitList);
		
		fruitList.removeFirst();
		System.out.println(fruitList);
		
		fruitList.removeLast();
		System.out.println(fruitList);

		fruitList.remove("apple");
		System.out.println(fruitList);

		fruitList.clear();
		System.out.println(fruitList);

	}

}
