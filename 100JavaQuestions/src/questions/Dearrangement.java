package initial;
import java.util.HashMap;
import java.util.Map;

public class New {
	
	static int[] dp = new int[1 << 20];
	static int factorial(int n)
	{
		int fact = 1;
		for (int i = 2; i <= n; ++i) {
		fact *= i;
		}
		return fact;
	}
	static int countDerangements(int i, int mask,
								int n, String S)
	{
		if (mask == (1 << n) - 1) {
		return 1;
		}
		if (dp[mask] != -1) {
		return dp[mask];
		}
		dp[mask] = 0;

		for (int j = 0; j < n; ++j) {

		if ((mask & (1 << j)) == 0
			&& (S.charAt(i) != S.charAt(j))) {
			dp[mask] += countDerangements(
			i + 1, mask | (1 << j), n, S);
		}
		}
		return dp[mask];
	}
	static int UtilCountDerangements(String S,
									int N)
	{
		for(int i = 0;i<(1 << 8); i++)
		{
		dp[i]=-1;
		}
		HashMap<Character,
		Integer> frequencyMap = new HashMap<Character,
		Integer>();


		for (int i = 0; i < N; i++) {

		if(frequencyMap.containsKey(S.charAt(i))){
			frequencyMap.put(S.charAt(i), frequencyMap.get(S.charAt(i))+1);
		}else{
			frequencyMap.put(S.charAt(i), 1);
		}
		}					

		int ans
		= countDerangements(0, 0, N, S);
		for (Map.Entry<Character,Integer> itr : frequencyMap.entrySet())
		{
		int times = itr.getValue();
		if (times > 1) {
			ans /= factorial(times);
		}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		String S = "abc";
		int N = S.length();
		System.out.println( UtilCountDerangements(S, N));
	}
	}
