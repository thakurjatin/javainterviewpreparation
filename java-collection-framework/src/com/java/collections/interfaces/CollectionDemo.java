package com.java.collections.interfaces;

import java.util.*;
//import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new java.util.ArrayList();
			fruitCollection.add("mango");
			fruitCollection.add("banana");
			fruitCollection.add("apple");
			System.out.println(fruitCollection);
			
			fruitCollection.remove("mango");
			System.out.println(fruitCollection);
			
			System.out.println(fruitCollection.contains("apple"));
		
			fruitCollection.forEach((element) -> {
				System.out.println(element);
			});
			
			fruitCollection.clear();
			System.out.println(fruitCollection);
	}

}
