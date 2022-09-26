package methodref;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class MethodReferencesDemo {
	
	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static int addition(int a, int b) {
		return (a+b);
	}
	
	public static void main(String args[]) {
		
		//1.Method Reference to static method
		//lambda Expression
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(16));
		
		//using method refrence
		Function<Integer, Double> functionReFunction = Math::sqrt;
		System.out.println(functionReFunction.apply(36));
		
		// lambda Expression
		BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> MethodReferencesDemo.addition(a, b);
		System.out.println(biFunction.apply(10, 20));
		
		// using method reference
		BiFunction<Integer, Integer, Integer> biFunctionRefrence = MethodReferencesDemo::addition;
		System.out.println(biFunctionRefrence.apply(30, 40));
		
		//2. Method reference to an instance method of an object
		//
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
		
		// lambda expression
		// we can assign this lambda to printable because both methods have same return type and argument
		Printable printable = (msg) -> methodReferencesDemo.display(msg);
		printable.print("hello!");
		
		// using method refrence
		Printable printable2 = methodReferencesDemo::display;
		printable2.print("world!");
		
		//3. Reference to the instance method of arbitary object
		// Sometimes, we call a method of argument in the lambda expression'
		// In that case, we can use a method reference to call an instance
		// method of arbitary object of specific type
		
		Function<String, String> stringFunction = (String input)-> input.toLowerCase();
		System.out.println(stringFunction.apply("Java Guides"));
		
		//using method reference
		Function<String, String> stFunction = String::toLowerCase;
		System.out.println(stFunction.apply("Java Guides"));
		
		String[] strArray = { "A", "B", "C", "D", "E"};
		//lambda expression
		Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
		//method expression
		Arrays.sort(strArray, String::compareToIgnoreCase);
		
		
		//4. Refernce to a constructor
		// we will convert list into set
		List<String> fruit = new ArrayList<String>();
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("Orange");
		
		Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
		System.out.println(setFunction.apply(fruit));
		
		//method reference
		
		Function<List<String>, Set<String>> setFunctionReFunction = HashSet::new;
		System.out.println(setFunctionReFunction.apply(fruit));

	}
}
