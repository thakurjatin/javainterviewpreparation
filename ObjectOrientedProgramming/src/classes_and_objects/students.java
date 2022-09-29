package classes_and_objects;

public class students {
	String name;
	//final data member can be initialized as sonn as they are declared
	private final int rollNumber;
	//static variable is shared by every object
	private static int numStudents;
	
	
	// static function does not depend on objects while non-static depends on objects
//	Line 2: static functions cannot use non-static variables.
//
//	Line 3: Static function cannot call non-static function.
//
//	Line 4:this or super keyword cannot be used inside a static function.
	public static int getNumStudents() {
		return numStudents;
	}
	//this is used to access data member same name as local variable
	public students (String name, int rollNumber) {
		System.out.println(this);
		this.name =name;
		this.rollNumber  = rollNumber;
		numStudents++;
	}
	
//	public void setRollnumber(int rn) {
//		if(rn <= 0) {
//			return;
//		}
//		
//		rollNumber = rn;
//	}
	
	public int getRollnumber() {
		return rollNumber;
	}
	
	public void print () {
		System.out.println(name + ":" + rollNumber);
	}
}

