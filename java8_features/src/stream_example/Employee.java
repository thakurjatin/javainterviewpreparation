package stream_example;

public class Employee {
	private int age;
	private String name;
	private int id;
	private float salary;
	public Employee(int age, String name, int id, float salary) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	

}
