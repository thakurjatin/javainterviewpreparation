package questions;

public class VowelPresent {

	public static void main(String[] args) {
		
		System.out.println(stringContainsVowel("Hello"));
		System.out.println(stringContainsVowel("TV"));
	}
	
	public static boolean stringContainsVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
}
