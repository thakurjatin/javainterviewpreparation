package pattern;

import java.util.ArrayList;
import java.util.List;

class Vehicle22 implements Cloneable{
	private List<String> vehicleList;
	
	public Vehicle22(){
		this.vehicleList = new ArrayList<String>();
	}
	
	public Vehicle22(List<String> list) {
		this.vehicleList = list;
	}
	
	public void insertData() {
		vehicleList.add("Car 1");
		vehicleList.add("Car 2");
		vehicleList.add("Car 3");
		vehicleList.add("Car 4");
	}
	
	public List<String> getVehicleList(){
		return this.vehicleList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		
		for(String s : this.vehicleList) {
			tempList.add(s);
		}
		return new Vehicle22(tempList);
	}
}

public class PrototypePatternExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		Vehicle22 a = new Vehicle22();
		a.insertData();
		
		Vehicle22 b = (Vehicle22) a.clone();
		List<String> list = b.getVehicleList();
		list.add("Object b Car");
		
		System.out.println(b.getVehicleList());
		System.out.println(list);
		
		b.getVehicleList().remove(1);
		System.out.println(list);
		System.err.println(a.getVehicleList());
	}
}
