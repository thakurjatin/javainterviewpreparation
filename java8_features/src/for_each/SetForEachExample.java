package for_each;

import java.util.HashSet;
import java.util.Set;

public class SetForEachExample {
 public static void main(String[] args) {
	
	 	Set<Person> set = new HashSet<>();
		set.add(new Person("Jatin", 22));
		set.add(new Person("Rohit", 23));
		set.add(new Person("Kunal", 25));
		set.add(new Person("Pradeep", 26));
		
		// for each loop
		
		for(Person person: set) {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		}
		
		// forEach method + lambda Expression
		
		set.forEach((person) -> {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		});
		
		// stream with forEach Method 
		set.stream().forEach((person) -> {
			System.out.println(person.getAge());
			System.out.println(person.getName());

		});
		
}
}
