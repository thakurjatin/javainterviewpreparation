package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsFromString {

	public static void main(String[] args) {
		DuplicateWords("java guides java");
		DuplicateWords("Java is java again java");
		DuplicateWords("Super Man Bat Man Spider Man");

	}
	
	public static void DuplicateWords(String inputString) {
		
		// splitting string into words
		String[] words = inputString.split(" ");
		
		// creating hashmap with key as word and their count as value
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		//checking each word
		for(String word : words) {
			//whether its present in map
			if(wordCount.containsKey(word)) {
				//If it present increment its count by 1
				wordCount.put(word, wordCount.get(word) + 1);
			}else {
				// If not present put the word with value as 1
				wordCount.put(word, 1);
			}
		}
		// Extracting all keys of wordcount
	//	Set<String> wordsInString = wordCount.keySet();
		
		//Iterating through all words in wordCount
		
		for(String word : wordCount.keySet()) {
			// if word count greater than equal to 1
			
			if(wordCount.get(word) >= 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
		
	}
}
