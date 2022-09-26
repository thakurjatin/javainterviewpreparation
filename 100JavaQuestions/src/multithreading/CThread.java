package multithreading;

public class CThread extends Thread{

	@Override
	public void run() {
		System.out.println("Staring Thread:" + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("C Programming");
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
