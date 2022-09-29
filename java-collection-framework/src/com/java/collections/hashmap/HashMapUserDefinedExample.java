package com.java.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {

	public static void main(String[] args) {

		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Ekta", "Singh"));
		studentMap.put(2, new Student("Shu", "Saxena"));
		studentMap.put(3, new Student("Shuvh", "Saxena"));
		studentMap.put(4, new Student("Shuhdg", "Sna"));
		
		System.out.println(studentMap.values());

	}

}
