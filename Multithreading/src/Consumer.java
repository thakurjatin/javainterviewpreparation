
public class Consumer extends Thread {

	Company c;
	
	public Consumer(Company c) {
		this.c = c;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.c.consume_itrm();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
