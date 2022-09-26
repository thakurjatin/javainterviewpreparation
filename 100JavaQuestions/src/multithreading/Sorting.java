package multithreading;

public class Sorting {

	void arraySort(int arr[]) {
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
		
		
		int[] arr = {0,1,2,0,1,2};
		
		Sorting s = new Sorting();
		s.arraySort(arr);
		System.out.println("Sorted array");
		print(arr);
		}
	
}