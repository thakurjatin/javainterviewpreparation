package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String args[]) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Output.txt"));
			Employee e1 = (Employee)in.readObject();
			Employee e2 = (Employee)in.readObject();
			Employee e3 = (Employee)in.readObject();
			
			System.out.println(e1.id+ " "+ e1.name);
			System.out.println(e2.id+ " "+ e2.name);
			System.out.println(e3.id+ " "+ e3.name);
			
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
