
public class Company {

	int n;
	boolean f = false;
	// f= false producer will produce
	// f= true consumer will produce
	
	
	synchronized public void produce_item(int n) throws InterruptedException {
		
		if(f) {
			wait();
		}
		
		this.n = n;
		System.out.println("Produced : " + this.n);
		f= true;
		notify();
	}
	
	synchronized public int consume_itrm() throws InterruptedException {
		
		if(!f) {
			wait();
		}
		System.out.println("Consumed :" + this.n);
		f= false;
		notify();
		return this.n;
	}
}
