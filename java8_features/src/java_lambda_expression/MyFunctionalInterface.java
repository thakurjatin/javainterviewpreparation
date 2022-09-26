package java_lambda_expression;


@FunctionalInterface
public interface MyFunctionalInterface {
	void print(String msg);
	
	default void m1() {
		System.out.println("Default method");
	}
	
	static void m3() {
		System.out.println("Static Method");
	}

}
