package vehicle;

public abstract class vehicle {
	
	protected String color;
	private int maxSpeed;
	
	
	public vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle constructor");
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public abstract boolean isMotarized();
	
	public void print() {
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);

	}






}
