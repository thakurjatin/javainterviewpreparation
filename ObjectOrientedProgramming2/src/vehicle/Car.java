package vehicle;

public class Car extends vehicle{

	int numGears;
	boolean isConvertible;
	
	public Car(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car constructor");
	}
	// or make class abstract 
	@Override
	public boolean isMotarized() {
		return false;
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
		

	}
}
