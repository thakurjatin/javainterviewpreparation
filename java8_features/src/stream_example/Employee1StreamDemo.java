package java8questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee1StreamDemo {
	static List<Employee1> Employee1List = new ArrayList<Employee1>();

	public static void main(String[] args) {

		Employee1List.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		Employee1List.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		Employee1List.add(new Employee1(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		Employee1List.add(new Employee1(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		Employee1List.add(new Employee1(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		Employee1List.add(new Employee1(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		Employee1List.add(new Employee1(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		Employee1List.add(new Employee1(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		Employee1List.add(new Employee1(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		Employee1List.add(new Employee1(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		Employee1List.add(new Employee1(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		Employee1List.add(new Employee1(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		Employee1List.add(new Employee1(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		Employee1List.add(new Employee1(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		Employee1List.add(new Employee1(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		Employee1List.add(new Employee1(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		Employee1List.add(new Employee1(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Query 1 : How many male and female Employee1s are there in the organization?
		method1();
		System.out.println("\n");
		// Query 2 : Print the name of all departments in the organization?
		method2();
		System.out.println("\n");
		// Query 3 : What is the average age of male and female Employee1s?
		method3();
		System.out.println("\n");
		// Query 4 : Get the details of highest paid Employee1 in the organization?
		method4();
		System.out.println("\n");
		// Query 5 : Get the names of all Employee1s who have joined after 2015?
		method5();
		System.out.println("\n");
		// Query 6 : Count the number of Employee1s in each department?
		method6();
		System.out.println("\n");
		// Query 7 : What is the average salary of each department?
		method7();
		System.out.println("\n");
		// Query 8 : Get the details of youngest male Employee1 in the product
		// development department?
		method8();
		System.out.println("\n");
		// Query 9 : Who has the most working experience in the organization?
		method9();
		System.out.println("\n");
		// Query 10 : How many male and female Employee1s are there in the sales and
		// marketing team?
		method10();
		System.out.println("\n");
		// Query 11 : What is the average salary of male and female Employee1s?
		method11();
		System.out.println("\n");
		// Query 12 : List down the names of all Employee1s in each department?
		method12();
		System.out.println("\n");
		// Query 13 : What is the average salary and total salary of the whole
		// organization?
		method13();
		System.out.println("\n");
		// Query 14 : Separate the Employee1s who are younger or equal to 25 years from
		// those Employee1s who are older than 25 years.
		method14();
		System.out.println("\n");
		// Query 15 : Who is the oldest Employee1 in the organization? What is his age
		// and which department he belongs to?
		method15();

	}

	public static void method1() {
		System.out.println("Query 1 : How many male and female Employee1s are there in the organization?");
		Map<String, Long> noOfMaleAndFemaleEmployee1s = Employee1List.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployee1s);
	}

	public static void method2() {
		System.out.println("Query 2 : Print the name of all departments in the organization?");
		Employee1List.stream().map(Employee1::getDepartment).distinct().forEach(System.out::println);
	}

	public static void method3() {
		System.out.println("Query 3 : What is the average age of male and female Employee1s?");
		Map<String, Double> averageAgeOfMaleAndFemaleEmployee1 = Employee1List.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingInt(Employee1::getAge)));
		System.out.println(averageAgeOfMaleAndFemaleEmployee1);
	}

	public static void method4() {
		System.out.println("Query 4 : Get the details of highest paid Employee1 in the organization?");
		Optional<Employee1> highestPaidEmployee1Wrapper = Employee1List.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
		System.out.println(highestPaidEmployee1Wrapper.get().getName());
	}

	public static void method5() {
		System.out.println("Query 5 : Get the names of all Employee1s who have joined after 2015?");
		Employee1List.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee1::getName)
				.forEach(System.out::println);
	}

	public static void method6() {
		System.out.println("Query 6 : Count the number of Employee1s in each department?");
		Map<String, Long> Employee1CountByDepartment = Employee1List.stream()
				.collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = Employee1CountByDepartment.entrySet();

		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void method7() {
		System.out.println("Query 7 : What is the average salary of each department?");
		Map<String, Double> avgSalaryOfDepartments=
				Employee1List.stream().collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.averagingDouble(Employee1::getSalary)));
				         
				Set<Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
				         
				for (Entry<String, Double> entry : entrySet) 
				{
				    System.out.println(entry.getKey()+" : "+entry.getValue());
				}
	}

	public static void method8() {
		System.out
				.println("Query 8 : Get the details of youngest male Employee1 in the product development department?");
		Optional<Employee1> youngestMaleEmployee1InProductDevelopmentWrapper=
				Employee1List.stream()
				            .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
				            .min(Comparator.comparingInt(Employee1::getAge));
				         
				Employee1 youngestMaleEmployee1InProductDevelopment = youngestMaleEmployee1InProductDevelopmentWrapper.get();
				         
				System.out.println("Details Of Youngest Male Employee1 In Product Development");
				         
				System.out.println("----------------------------------------------");
				         
				System.out.println("ID : "+youngestMaleEmployee1InProductDevelopment.getId());
				         
				System.out.println("Name : "+youngestMaleEmployee1InProductDevelopment.getName());
				         
	}

	public static void method9() {
		System.out.println("Query 9 : Who has the most working experience in the organization?");
		Optional<Employee1> seniorMostEmployee1Wrapper=
				Employee1List.stream().sorted(Comparator.comparingInt(Employee1::getYearOfJoining)).findFirst();
				         
				Employee1 seniorMostEmployee1 = seniorMostEmployee1Wrapper.get();
				         
				System.out.println("Senior Most Employee1 Details :");
				         
				System.out.println("----------------------------");
				         
				System.out.println("ID : "+seniorMostEmployee1.getId());
				         
				System.out.println("Name : "+seniorMostEmployee1.getName());
	}

	public static void method10() {
		System.out.println("Query 10 : How many male and female Employee1s are there in the sales and marketing team?");
		Map<String, Long> countMaleFemaleEmployee1sInSalesMarketing=
				Employee1List.stream()
				            .filter(e -> e.getDepartment()=="Sales And Marketing")
				            .collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));
				 
				System.out.println(countMaleFemaleEmployee1sInSalesMarketing);
	}

	public static void method11() {
		System.out.println("Query 11 : What is the average salary of male and female Employee1s?");
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployee1s=
				Employee1List.stream().collect(Collectors.groupingBy(Employee1::getGender, Collectors.averagingDouble(Employee1::getSalary)));
				         
				System.out.println(avgSalaryOfMaleAndFemaleEmployee1s);
	}

	public static void method12() {
		System.out.println("Query 12 : List down the names of all Employee1s in each department?");
		Map<String, List<Employee1>> Employee1ListByDepartment=
				Employee1List.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
				         
				Set<Entry<String, List<Employee1>>> entrySet = Employee1ListByDepartment.entrySet();
				         
				for (Entry<String, List<Employee1>> entry : entrySet) 
				{
				    System.out.println("--------------------------------------");
				             
				    System.out.println("Employee1s In "+entry.getKey() + " : ");
				             
				    System.out.println("--------------------------------------");
				             
				    List<Employee1> list = entry.getValue();
				             
				    for (Employee1 e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
	}

	public static void method13() {
		System.out.println("Query 13 : What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics Employee1SalaryStatistics=
				Employee1List.stream().collect(Collectors.summarizingDouble(Employee1::getSalary));
				         
				System.out.println("Average Salary = "+Employee1SalaryStatistics.getAverage());
				         
				System.out.println("Total Salary = "+Employee1SalaryStatistics.getSum());
	}

	public static void method14() {
		System.out.println(
				"Query 14 : Separate the Employee1s who are younger or equal to 25 years from those Employee1s who are older than 25 years.");
		Map<Boolean, List<Employee1>> partitionEmployee1sByAge=
				Employee1List.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
				         
				Set<Entry<Boolean, List<Employee1>>> entrySet = partitionEmployee1sByAge.entrySet();
				         
				for (Entry<Boolean, List<Employee1>> entry : entrySet) 
				{
				    System.out.println("----------------------------");
				             
				    if (entry.getKey()) 
				    {
				        System.out.println("Employee1s older than 25 years :");
				    }
				    else
				    {
				        System.out.println("Employee1s younger than or equal to 25 years :");
				    }
				             
				    System.out.println("----------------------------");
				             
				    List<Employee1> list = entry.getValue();
				             
				    for (Employee1 e : list) 
				    {
				        System.out.println(e.getName());
				    }
				}
	}

	public static void method15() {
		System.out.println(
				"Query 15 : Who is the oldest Employee1 in the organization? What is his age and which department he belongs to?");
		Optional<Employee1> oldestEmployee1Wrapper = Employee1List.stream().max(Comparator.comparingInt(Employee1::getAge));
        
		Employee1 oldestEmployee1 = oldestEmployee1Wrapper.get();
		         
		System.out.println("Name : "+oldestEmployee1.getName());
		         
		System.out.println("Age : "+oldestEmployee1.getAge());
		         
		System.out.println("Department : "+oldestEmployee1.getDepartment());
	}

}

class Employee1 {
	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}
