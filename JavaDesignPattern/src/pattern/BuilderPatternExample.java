package pattern;

class Vehicle1{
	
	// required parameter
	private String engine;
	private int speed;
	
	// optional parameter
	private int airbage;
	
	public String getEngine() {
		return this.engine;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public int getAirbage() {
		return this.airbage;
	}
	
	Vehicle1(VehicleBuilder builder){
		this.engine = builder.engine;
	}
	
	public static class VehicleBuilder{
		
		private String engine;
		private int speed;
		
		private int airbage;
		
		public VehicleBuilder(String engine, int speed) {
			this.engine = engine;
			this.speed = speed;
		}
		
		public VehicleBuilder setAirbag(int airbage) {
			 this.airbage = airbage;
			 return this;
		}
		
		public Vehicle1 build() {
			return new Vehicle1(this);
		}
	}
}

public class BuilderPatternExample {
	
	public static void main(String[] args) {
		Vehicle1 car = new Vehicle1.VehicleBuilder("1500cc", 100).setAirbag(4).build();
		Vehicle1 bike = new Vehicle1.VehicleBuilder("250cc", 2).build();
	    
	    System.out.println(car.getEngine());
	    System.out.println(car.getSpeed());
	    System.out.println(car.getAirbage());
	    
	    System.out.println(bike.getEngine());
	    System.out.println(bike.getSpeed());
	    System.out.println(bike.getAirbage());
	}
}
