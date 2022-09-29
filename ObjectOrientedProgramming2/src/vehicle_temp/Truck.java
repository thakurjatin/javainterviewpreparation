package vehicle_temp;

import vehicle.vehicle;

public class Truck extends vehicle{

	int maxLoadingCapacity;
	public void print() {
		System.out.println("Truck Capacity" + maxLoadingCapacity);
		System.out.println("Truck Color" + color);
		System.out.println("Truck speed" + getMaxSpeed());

	}
}
