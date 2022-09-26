package algorithms;

import java.util.Scanner;

public class SelectionSort {

	void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int max = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[max]) {
					max = j;
				}
			}
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
	}
	
	static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = ss.nextInt();
		}
		
		SelectionSort s = new SelectionSort();
		s.selectionSort(arr);
		System.out.println("Sorted array");
		print(arr);
		}
	
}
