package com._factorypattern;

public class Substract implements Calculate{

	@Override
	public void calculate(double a, double b) {
		System.out.println("a-b is " + (a-b));
		
	}

}
