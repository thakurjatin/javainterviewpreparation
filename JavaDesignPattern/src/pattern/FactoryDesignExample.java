package pattern;

abstract class Vehicle{
	
	public abstract int getWheel();
	
//	public String toString() {
//		return "wheel" + this.getWheel();
//	}
}

class Car extends Vehicle{

	int wheel;
	Car(int wheel){
		this.wheel = wheel;
	}
	
	@Override
	public int getWheel() {
		return this.wheel;
	}
	
}

class Bike extends Vehicle{
	int wheel;
	Bike(int wheel){
		this.wheel = wheel;
	}
	@Override
	public int getWheel() {
		return this.wheel;
	}	
}

class Factory{
	
	public static Vehicle getInstance(String type, int wheel) {
		if(type == "Car") {
			return new Car(wheel);
		} else if (type == "Bike") {
			return new Bike(wheel);
		}
		return null;
	}
}

public class FactoryDesignExample {

	public static void main(String[] args) {
		Vehicle car = Factory.getInstance("Car", 4);
		System.out.println(car);
		
		Vehicle bike = Factory.getInstance("Bike", 2);
		System.out.println(bike);
	}
	
}
