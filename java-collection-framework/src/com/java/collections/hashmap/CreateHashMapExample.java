package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String[] args) {

		// examples to map numbers to string
		Map<String, Integer> numberMapping = new HashMap<>();
		
		// add key-value to map
		
		numberMapping.put("one", 1);
		numberMapping.put("two", 2);
		numberMapping.put("three", 3);
		numberMapping.put("four", 4);
		numberMapping.put("five", 5);
		numberMapping.put(null, 6);
		
		System.out.println(numberMapping);
		
		// check if Hashmap is empty
		
		System.out.println(numberMapping.isEmpty());
		
		// check if key exist in the Hashmap
		if(numberMapping.containsKey("four")) {
			System.out.println("Exist");
		}else {
			System.out.println("Not Exist");
		}
		
		// check if value exist in the Hashmap
		
		if(numberMapping.containsValue(15)) {
			System.out.println("Exist");
		}else {
			System.out.println("Not Exist");
		}
		
		// get value by key
		Integer v1 = numberMapping.get("four");
		System.out.println(v1);
		
		// get only keys from hashmap
		
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);
		
		// different ways to iterate
		// for each method
		
		for(Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
			System.out.println("Key ->" + entry.getKey() + " Value ->" + entry.getValue());
		}
		
		// using iterator
		
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key ->" + entry.getKey() + " Value ->" + entry.getValue());
			
		}
		
	}

}
