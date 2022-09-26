package java8questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenNumber {

	public static void main(String[] args) {
		
		//find out all the even numbers exist in the list using Stream functions?
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().filter(n-> n%2 == 0).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		
		//find out all the numbers starting with 1 using Stream functions?
		List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,32);
		myList2.stream().map(koo -> koo + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		
		// find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<Integer>();
		myList3.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");

		//Given the list of integers, find the first element of the list using Stream functions?
		
		myList3.stream().findFirst().ifPresent(System.out::println);
		
		System.out.println("--------------------------------------------------");
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		long count = myList3.stream().count();
		System.out.println(count);
		
		System.out.println("--------------------------------------------------");

		//Given a list of integers, find the maximum value element present in it using Stream functions?
		int max = myList3.stream().max(Integer::compare).get();
		System.out.println(max);
		
		System.out.println("--------------------------------------------------");
		// Sort in ascending and desending order
		myList3.stream().sorted().forEach(System.out::println);
		myList3.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		List<Integer> array = new ArrayList<Integer>(myList3);
//		Collections.sort(array);
//		System.out.println(array);
		
		System.out.println("--------------------------------------------------");

		
	}
}
