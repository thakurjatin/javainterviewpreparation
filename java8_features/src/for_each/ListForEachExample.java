package for_each;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Jatin", 22));
		list.add(new Person("Rohit", 23));
		list.add(new Person("Kunal", 25));
		list.add(new Person("Pradeep", 26));
		
		//prior java 8
		for(Person person : list) {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		}
		
		// using lambda
		list.forEach((person) -> {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		});
		
		// stream
		list.stream().forEach((person) -> {
			System.out.println(person.getAge());
			System.out.println(person.getName());
		});
	}
}

class Person{
	
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
