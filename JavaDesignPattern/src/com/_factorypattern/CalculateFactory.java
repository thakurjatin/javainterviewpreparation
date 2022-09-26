package com._factorypattern;

public class CalculateFactory {
	
	public Calculate getCalculation(String type) {
		
		Calculate obj = null;
		
		if(type.toLowerCase().equals("add")) {
			obj = new Add();
		}
		else if(type.toLowerCase().equals("substract")) {
			obj = new Substract();
		}
		else if(type.toLowerCase().equals("divide")) {
			obj = new Divide();
		}
		else {
			System.out.println("We don't do that");
		}
		return obj;
	}

}
