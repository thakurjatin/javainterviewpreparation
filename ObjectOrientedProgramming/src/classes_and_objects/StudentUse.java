package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		students s1 = new students("ankush", 123);
		System.out.println(s1);
		//System.out.println(s1.name);
		//System.out.println(s1.getRollnumber());
		s1.print();
		students s2 = new students("manish", 345);
		System.out.println(s2);
		s2.print();
//		System.out.println(s2.numStudents);
//		System.out.println(s1.numStudents);
		//Static data member can be access by class but non-static by object
		System.out.println(students.getNumStudents());
		//System.out.println(s1.name);
		
		
	//	System.out.println(s1.name);
	//	System.out.println(s2.getRollnumber());



}
}
