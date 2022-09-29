package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {

		List<String> topProgrammingLanguage = new ArrayList<>();
		
		System.out.println("is topprogramming language is empty? : " + topProgrammingLanguage.isEmpty());
		
		topProgrammingLanguage.add("c");
		topProgrammingLanguage.add("java");
		topProgrammingLanguage.add("python");
		topProgrammingLanguage.add("JS");
		topProgrammingLanguage.add("Nodejs");
		
		System.out.println("Here is the top " + topProgrammingLanguage.size() + " in the world");
		
		String bestProgrmmingLanguage = topProgrammingLanguage.get(2);
		System.out.println(bestProgrmmingLanguage);
		
		topProgrammingLanguage.set(4, "C#");
		System.out.println(topProgrammingLanguage);

	}

}
