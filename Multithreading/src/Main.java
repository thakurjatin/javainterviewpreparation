
public class Main {

	public static void main(String[] args) {
		
		Company c1 = new Company();
		Producer p = new Producer(c1);
		Consumer c = new Consumer(c1);
		
		p.start();
		c.start();
	}
}
