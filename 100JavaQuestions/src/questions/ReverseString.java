package questions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = "";
		int n = string1.length();
		char ch;
		
		System.out.println(string1);
		for(int i=0; i<n; i++) {
			ch = string1.charAt(i);
			string2 = ch+string2;
		}
		System.out.println(string2);
		// second approach 
		// using build in reverse() method of stringBuilder class
		
		//String str = "abcd123";
		System.out.println(reverse(string1));
		
	}
	
	public static String reverse(String str) {
		
		StringBuilder outBuilder = new StringBuilder();
		char[] array = str.toCharArray();
		
		for(int i = array.length -1; i>=0 ; i--) {
			outBuilder.append(array[i]);
		}
		return outBuilder.toString();
	}
	
	
}
