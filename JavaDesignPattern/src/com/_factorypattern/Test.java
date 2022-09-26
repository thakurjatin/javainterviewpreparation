package com._factorypattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input First Number");
		double num1 = input.nextDouble();
		
		System.out.println("Input First Number");
		double num2 = input.nextDouble();
		
		System.out.println("Enter calculation required for Add, Substract or Divide");
		
//		Divide obj = new Divide();
		CalculateFactory factory = new CalculateFactory();
		Calculate obj = factory.getCalculation(input.next());
		obj.calculate(num1, num2);
	}

}
