package stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementExample {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> first = list.stream().findFirst();
		if(first.isPresent()) {
			System.out.println(first.get());
		}else {
			System.out.println("stream is empty");
		}
		
		Optional<Integer> element1 = list.stream().findAny();
		if(element1.isPresent()) {
			System.out.println(element1.get());
		} else {
			System.out.println("stream is empty");
		}
	}

}
