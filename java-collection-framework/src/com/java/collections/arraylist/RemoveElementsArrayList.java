package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("chiku");
		System.out.println(fruits);
		
		fruits.remove(2);
		System.out.println(fruits);

		fruits.remove("mango");
		System.out.println(fruits);

		List<String> subFruitsList = new ArrayList<>();
		subFruitsList.add("banana");
		
		fruits.removeAll(subFruitsList);
		System.out.println(fruits);
		
	}

}
