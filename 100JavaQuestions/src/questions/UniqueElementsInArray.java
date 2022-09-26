package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElementsInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i : arr) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
//		int arr[] = {1,2,3,4,5,1,6,3,2};
//		
//		// using hashmap
//		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//		for(int j : arr) {
//			hashMap.put(arr[j], j);
//			System.out.print(hashMap + " ");
//		}
//		System.out.println(hashMap.keySet());
		
		// using nested loop
		
		for(int i = 0; i<n; i++) {
			int j;
			for(j=0; j<i ; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
			if(i==j) {
				System.out.println(arr[i] + " ");
			}
		}
	}
	
	
}
