package questions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	System.out.println(printFibonacciSeries(13));
		System.out.println(printSeries(n));
		
		
	}
	
	// method 1 using for loop
	public static int printFibonacciSeries(int count) {
		int a =0;
		int b=1;
		int c = 1;
		for(int i=0; i<=count; i++) {
			System.out.println(a + " ");
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}
	
	// method 2 using recurssion
	public static int printSeries(int n) {
		if(n<=1) {
			return n;
		}
		return printSeries(n-1) + printSeries(n-2);
	}
}
