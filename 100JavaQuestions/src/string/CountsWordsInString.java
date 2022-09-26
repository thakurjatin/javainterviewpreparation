package string;

public class CountsWordsInString {

	public static void main(String[] args) {
		
		String inputString = "Arise! Awake! and stop not until the goal is reached.";
		System.out.println("Input String is: "+ inputString);
		System.out.println("No. of words using split(): " + countWordsUsingSplit(inputString));
		
		char[] c = inputString.toCharArray();
		System.out.println("array" + c);
	}

	public static int countWordsUsingSplit(String inputString) {
		
		String[] stringArray = inputString.split("[!]");
		return stringArray.length;
	}
}
