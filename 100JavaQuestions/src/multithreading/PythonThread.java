package multithreading;

public class PythonThread extends Thread{

	@Override
	public void run() {
		System.out.println("Staring Thread:" + Thread.currentThread().getName());
		for (int i = 0; i < 12; i++) {
			System.out.println("Python Programming");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println("Finish Thread:" + Thread.currentThread().getName());

	}

}
