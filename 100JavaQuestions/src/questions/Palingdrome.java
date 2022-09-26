package questions;

import java.util.Scanner;

public class Palingdrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		System.out.println(isPallingdrome(str));
	}

	private static boolean isPallingdrome(String str) {
		// TODO Auto-generated method stub
		boolean result = true;
		int n = str.length();
		char[] ch = str.toCharArray();
		for(int i=0; i<n/2; i++) {
			if(ch[i] != ch[n-i-1]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
