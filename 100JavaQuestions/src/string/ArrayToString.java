package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
	
	public static void main(String[] args) {
		String[] stringArray = {"My", "name", "is", "jatin", "!"};
		
		//1. Using Arrays.toString() method
		
		String string1 = ArrayToStringMethod(stringArray);
		System.out.println("Array To String Method Output:" + string1);
		
		
		//2. Using the StringBuilder.append() method
		
		String string2 = ArrayToStringUsingBuilder(stringArray);
		System.out.println("Using Builder Append: " + string2);
		
		//3. Using the String.join() method
		
		String string3 = ArrayToStringUsingJoin(stringArray);
		System.out.println("Using String,Join Method:  " + string3);
		
		//4. Using the collector.joining() method
		
		String string4 = ArrayToStringUsingCollectorJoining(stringArray);
		System.out.println("Using Collector Joining  " + string4);
	}
	
	public static String ArrayToStringMethod(String[] stringArray) {
		return Arrays.toString(stringArray);
	}
	
	public static String ArrayToStringUsingBuilder(String[] stringArray) {
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0; i<stringArray.length; i++) {
			stringBuilder.append(stringArray[i]);
		}
		return stringBuilder.toString();
	}
	
	
	public static String ArrayToStringUsingJoin(String[] stringArray) {
		String str = String.join(" ", stringArray);
		return str;
	}
	
	public static String ArrayToStringUsingCollectorJoining(String[] stringArray) {
		String str1 = Arrays.stream(stringArray).collect(Collectors.joining());
		return str1;
	}

}
