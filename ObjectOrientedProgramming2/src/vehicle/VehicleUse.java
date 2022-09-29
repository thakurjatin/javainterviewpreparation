package vehicle;


public class VehicleUse {

	public static void main(String[] args) {

		//vehicle v = new vehicle(200);
		
		vehicle v = new Car(100, 2);  // ploymorphism
//		v.setMaxSpeed(10);
//		v.print();
//		
		vehicle v1 = new Car(100,20);
		v1.print();
		
		Car c = new Car(1000, 4848484);
	//	c.numGears = 10;
		c.color = "black";
		c.setMaxSpeed(20);
		//c.print();
		
		
	}

}
