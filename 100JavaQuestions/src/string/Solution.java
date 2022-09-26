package string;

public class Solution {

    public static int solution(String S) {
        // write your code in Java SE 8
        int counter = 0;
		
		//int V = Convert.ToInt32(S,2);
		int V = Integer.parseInt(S,2);
	//	Long num= Long.valueOf(str);
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		int n=0;
		if (V > max) {
		        n = max;
		    }
		if (V < min) {
		        n = min;
		    }
		if (V <= max && V >= min)
		  n = Integer.parseInt(S,2);
		System.out.println("Value :" + V);
		while(n > 0)
		{
			if(n%2 == 0)
			{
				n = n/2;
			}
			else
			{
				n = n -1;
			}
			counter++;
		}

	 	return counter;
    }

    public static void main(String[] args){
        String S = "011100111111111111111111111111111111111111111111111111111111111111111111111111111111";
		System.out.println("Input:" + S);
		
		int result = solution(S);
		System.out.println("Result:" + result);
    }
}

