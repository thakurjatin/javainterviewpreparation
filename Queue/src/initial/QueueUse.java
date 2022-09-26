package initial;

public class QueueUse {

	public static void main(String[] args) {
		
		QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
//		QueueUsingArray queue = new QueueUsingArray(3);
		for(int i = 0; i<=5; i++) {
			queue.enqueue(i);
		}
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueneEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
