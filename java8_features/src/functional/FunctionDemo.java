package functional;

import java.util.function.Function;

//import java.util.function.Function;

//class FunctionImpl implements Function<String,Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		
//		return t.length();
//	}
//	
//}

public class FunctionDemo {

	public static void main(String[] args) {

//		Function<String, Integer> function = new FunctionImpl();
//		System.out.println(function.apply("Ravi"));
		
		Function<String, Integer> function2 = (t) ->t.length();
		System.out.println(function2.apply("Ravioooo"));
	}

}
