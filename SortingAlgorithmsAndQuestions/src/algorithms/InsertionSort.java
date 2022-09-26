package algorithms;

import java.util.Scanner;

// divide array into sorted and unsorted, take first element as sorted rest as unsorted, compare sorted and unsorted 

public class InsertionSort {
	
	void insertionSort(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j = j -1;
				
			}
			arr[j+1] = temp;
		}
	}
	
	static void print(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		InsertionSort ins = new InsertionSort();
		ins.insertionSort(arr);
		System.out.println("Sorted Array");
		print(arr);
	}


}
