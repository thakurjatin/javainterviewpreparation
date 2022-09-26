package stream_example;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		//create a stream of array
		Stream<String> stream = Stream.of("a","b","c");
		stream.forEach(System.out::println);
		
		// create a stream from sources
		
		Collection<String> collection = Arrays.asList("Java", "Python", "Angular", "C++"); //creating an arraylist
		Stream<String> stream2 = collection.stream(); // creating stream from collection object
		stream2.forEach(System.out::println);  //printing the elements present in stream
		
		// create stream from list
		
		List<String> list = Arrays.asList("Java", "Python", "Angular", "C++");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		// create stream from set
		
		Set<String> set = new HashSet<String>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		// create stream using arrays
		
		String[] strArray = {"a", "b", "c"};
		Stream<String> stream5 = Arrays.stream(strArray);
		stream5.forEach(System.out::println);
	}

}
