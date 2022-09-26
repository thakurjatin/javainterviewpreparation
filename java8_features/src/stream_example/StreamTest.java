package stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Jayesh", 20, new Address("1234"), Arrays.asList(new MobileNumber("1234"), new MobileNumber("1233")));
		Student student2 = new Student("Khyati", 20, new Address("1235"), Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333")));
		Student student3 = new Student(
	            "Jason",
	            20,
	            new Address("1236"),
	            Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
		
		
		List<Student> students = Arrays.asList(student1,student2,student3);
		
		/*****************************************************
        Get student with exact match name "jayesh"
       *****************************************************/
		
		List<Student> stud1 = students.stream().filter(student -> student.getName().equals("Jayesh")).collect(Collectors.toList());
		stud1.forEach(System.out::println);
		Optional<Student> stud = students.stream()
	            .filter(student -> student.getName().equals("Ram")).findFirst();
	        System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");
	        System.out.println("---------------------------------------------");
	        
	        /*****************************************************
	         Get student with matching address "1235"
	        *****************************************************/
	        
	    Optional<Student> stud2 = students.stream().filter(student -> student.getAddress().getZipcode().equals("1235")).findFirst();
	    System.out.println(stud2.isPresent() ? stud2.get().getName() :"No address found");
 	    
	}
}
