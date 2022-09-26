package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String agrs[]) {
		
		try {
			
			Employee emp1 = new Employee(1, "John");
			Employee emp2 = new Employee(2, "Jatin");
			Employee emp3 = new Employee(3, "Ritik");
			
			
			FileOutputStream fout = new FileOutputStream("Output.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.flush();
			
			out.close();
			System.out.println("Serialization and Deserialization is successfully executed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
