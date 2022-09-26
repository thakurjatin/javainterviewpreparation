package questions;

import java.util.ArrayList;
import java.util.List;

public class ListContainOddNumber {

	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	list.add(22);
//	list.add(11);
//	list.add(7);
//	list.add(16);
//	System.out.println(isOdd(list));
	System.out.println(onlyoddNumber(list));
		
	}
	// using for loop
	public static boolean isOdd(List<Integer> list) {
		for(int i: list) {
			if(i%2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean onlyoddNumber(List<Integer> list) {
		// parallel stream for fast processing 
		return list.parallelStream().anyMatch(x -> x%2 !=0);
	}
}
