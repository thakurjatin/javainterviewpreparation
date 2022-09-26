package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String args[]) {
		int[] array = {1,2,3,4,5,6,-1,-2};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		List<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		arr.add("d");
		Collections.sort(arr);
		for(int i =0; i<arr.size(); i++) {
			System.out.println(arr);
		}
		for(String string : arr) {
			System.out.println(string);
		}
	}
}
