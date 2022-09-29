package com.java.collections.hashset;

import java.util.HashSet;
import java.util.Set;

// 1. Create a HashSet from another collection using the HashSet(Collection c) constructor.
// 2. Add all elements from a collection to the HashSet using the addAll() method.

public class CreateHashSetFromCollectionExample {

	public static void main(String[] args) {

		Set<Integer> firstFiveEvenNumber = new HashSet<Integer>();
		firstFiveEvenNumber.add(2);
		firstFiveEvenNumber.add(3);
		firstFiveEvenNumber.add(5);
		firstFiveEvenNumber.add(7);
		firstFiveEvenNumber.add(11);
		System.out.println(firstFiveEvenNumber);

		// 1. Create a HashSet from another collection using the HashSet(Collection c) constructor.
		Set<Integer> tenEvenNumber = new HashSet<Integer>(firstFiveEvenNumber);
		System.out.println(tenEvenNumber);
		
		// 2. Add all elements from a collection to the HashSet using the addAll() method.

		Set<Integer> nextEvenNumber = new HashSet<Integer>();
		nextEvenNumber.add(12);
		nextEvenNumber.add(14);
		nextEvenNumber.add(16);
		nextEvenNumber.add(18);
		nextEvenNumber.add(20);
		
		tenEvenNumber.addAll(nextEvenNumber);
		System.out.println(tenEvenNumber);

	}

}
