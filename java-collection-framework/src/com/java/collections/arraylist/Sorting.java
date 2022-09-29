package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {

		List<EmployeeSorting> employee = new ArrayList<EmployeeSorting>();
		employee.add(new EmployeeSorting(1, "Raj", 22, 2322222));
		employee.add(new EmployeeSorting(2, "Sachin", 24, 483635262));
		employee.add(new EmployeeSorting(3, "Sachi", 25, 55635262));
		employee.add(new EmployeeSorting(4, "Sac", 27, 635262));
		employee.add(new EmployeeSorting(5, "Sa", 28, 483662));
		

		System.out.println(employee);
		
		Collections.sort(employee, new MySort());

		System.out.println(employee);

	}

}

class MySort implements Comparator<EmployeeSorting>{
	
	@Override
	public int compare(EmployeeSorting o1, EmployeeSorting o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}
}
