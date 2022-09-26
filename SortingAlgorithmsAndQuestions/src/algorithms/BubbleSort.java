package algorithms;

import java.util.Scanner;

// compare adjacent elements of array, swap them, largest value goes to right side, value of n decrease in ecah loop
public class BubbleSort {
	
	void bubbleSort(int arr[]) {
		
		boolean swapped = false;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			swapped = false;
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					// swap arr[j] from arr[j+1]	
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
					}
				if(swapped == false)
					break;
			}
		}
	}
	
	void printValue(int arr[]) {
		int n = arr.length;
		for(int i = 0; i <n; i++) {
			System.out.print(arr[i] + " ");
		//	System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		BubbleSort bSort = new BubbleSort();
		bSort.bubbleSort(arr);
		System.out.println("Sorted Array");
		bSort.printValue(arr);
	}
}
