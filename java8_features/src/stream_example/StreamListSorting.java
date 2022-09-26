package stream_example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Carrot");
		
		// sort in ascending order
		
		List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		//sortedList.forEach(System.out::println);
		System.out.println(sortedList);
		
		List<String> sortedList2 = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		//sortedList2.forEach(System.out::println);
		System.out.println(sortedList2);
		
		List<String> sortedList3 = fruits.stream().sorted().collect(Collectors.toList());
		//sortedList3.forEach(System.out::println);
		System.out.println(sortedList3);
		
		// descending order sort
		
		List<String> sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList4);
		
		List<String> sortedList5 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList5);
		
		// sort employee by salary in ascending order
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(21, "Jatin", 1, 500000));
		employees.add(new Employee(22, "Ritik", 11, 550000));
		employees.add(new Employee(23, "Shashank", 13, 450000));
		employees.add(new Employee(24, "Manmmet", 15, 850000));

		List<Employee> sortedEmployees = employees.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).collect(Collectors.toList());
		System.out.println(sortedEmployees);
		
		// by lambda 
		List<Employee> sortedEmployees2 = employees.stream()
				.sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		System.out.println(sortedEmployees2);
		
		List<Employee> sortedEmployees3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees3);
		
		List<Employee> sortedEmployees6 = employees.stream().sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees6);
		
		List<Employee> sortedEmployees7 = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(sortedEmployees7);
		
		// descending order by salary, by age, by name
		
		
		List<Employee> sortedEmployees4 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedEmployees4);
		
		
		List<Employee> sortedEmployees5 = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedEmployees5);
		
		
		
		List<Employee> sortedEmployees8 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedEmployees8);
		
		
		
		
	}
}
