package java_lambda_expression;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Run print method........");
		
	}
	
}

public class RunnableLambdaExpression {

	public static void main(String args[]) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		
		Thread thread2 = new Thread(() -> System.out.println(" Run from main....."));
		thread2.start();
	}
}
