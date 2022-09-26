package string;

import java.util.ArrayList;

public class Testing {
	 public static void main(String[] args) {
//	        String inputString = "My name is Guarav Kukade!";
//	 
//	        printDuplicates(inputString);
		 String str = "ABCD 1234";
	        boolean result = str.matches("[0-9]+");
	        System.out.println("Original String : " + str);
	        System.out.println("Does string contain only Digits? : " + result);
	    }
	

	    }
	 
//	    public static void printDuplicates(String inputString) {
//	        // count
//	        int count = 0;
//	 
//	        // a temp list of ch for which we have already printed the count
//	        ArrayList<Character> charList = new ArrayList<>();
//	 
//	        for (int i = 0; i < inputString.length(); i++) {
//	 
//	            char ch = inputString.charAt(i);
//	 
//	            // count the number of occurrences of the char ch in inputString
//	            for (int j = 0; j < inputString.length(); j++) {
//	                if (inputString.charAt(j) != ch) {
//	                    continue;
//	                }
//	                count++;
//	 
//	            }
//	 
//	            // check if we have already printed for ch
//	            if (!charList.contains(ch)) {
//	                // check if count is more than 1 i.e. duplicate and char should not be space
//	                if (count ==0  && ch != ' ') {
//	 
//	                    System.out.println("Char: " + ch + ", Count: " + count + " times.");
//	                    charList.add(ch);
//	                }
//	            }
//	 
//	            // set counter to zero for next ch
//	            count = 0;
//	        }
//	    }
	 
//	}

