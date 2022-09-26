package java_lambda_expression;

//import java.awt.Shape;

interface shape{
	void draw(); // bydefault it is public and abstract
}

class Rectangle implements shape{

	@Override
	public void draw() {
		System.out.println("Rectangle Shape");  // polymorphism
		
	}
	
}

class Square implements shape{

	@Override
	public void draw() {
		System.out.println("Square Shape"); // ploymorphism
		
	}
	
}

class Circle implements shape{

	@Override
	public void draw() {
		System.out.println("Circle Shapr");    //polymorphism
		
	}
	
}

public class LambdaExample {
	
	public static void main(String args[]) {
		
		// this lambda converts object oriented into functional programming
//		shape rectangle = () -> System.out.println(" Rechangle Shape"); 
//		rectangle.draw();
//		
//		shape squareShape = () -> System.out.println("Square Shape in main");
//		squareShape.draw();
//		
//		shape ciShape = () -> System.out.println("Circle Shape in main");
//		ciShape.draw();
		
		print(() -> System.out.println("Circle Shape in main"));
		print(() -> System.out.println("Square Shape in main"));
		print(() -> System.out.println(" Rechangle Shape"));
		
	}
	
	public static void print(shape shape) {
		shape.draw();
	}

}
