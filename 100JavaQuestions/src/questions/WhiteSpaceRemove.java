package questions;

import java.util.Scanner;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      //  System.out.println(str);
        System.out.println(removeWhite(str)); 
    }
     public static String removeWhite(String str){
        StringBuilder output = new StringBuilder();
        
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(!Character.isWhitespace(c))
            output.append(c);
        }
        return output.toString();
     }
}
