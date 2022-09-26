package defaultstatic;

interface vehicle{
	
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnVehicleOn() {
		return "VehicleOn";
	}
	
	//default methods are implicitly public so there is no need to specify the public modifier
	default String turnVehicleOff() {
		return "Vehicle Off";
	} 
	
	// called using interface name see in main method
	static String getName() {
		return "Tesla";
	}
}

class Car implements vehicle{

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "Fast";
	}

	@Override
	public String slowDown() {
		return "drive slow";
	}
	
}

public class DefaultDemo {
	public static void main(String args[]) {
		vehicle v1 = new Car();
		System.out.println(v1.getBrand());
		System.out.println(v1.speedUp());
		System.out.println(v1.slowDown());
		
		System.out.println(v1.turnVehicleOff());
		System.out.println(v1.turnVehicleOn());
		
		System.out.println(vehicle.getName());
		//System.out.println(Car.getName());
		
	}

}
