package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		printDuplicate(string);
	}

	public static void printDuplicate(String string) {
		
		int count = 0;
		ArrayList<Character> newList = new ArrayList<Character>();
		
		for(int i=0; i<string.length(); i++) {
			
			char ch = string.charAt(i);
			
			for(int j=0; j<string.length(); j++) {
				if(string.charAt(j) != ch) {
					continue;
				}
				count++;	
			}
			if(!newList.contains(ch)) {
				if(count > 1 && ch != ' ') {
					System.out.println("Character " + ch + "is coming: " + count);
					newList.add(ch);
				}
			}
			count = 0;
		}
		
	}

}
